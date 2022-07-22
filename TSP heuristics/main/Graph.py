import math
import os

import networkx as nx
import matplotlib.pyplot as plt
import numpy as np

import NearestNeighbour, RepeatedNearestNeighbour, Greedy, Insertion, Opt


class Graph:
    withEdges = False
    edgesFontSize = 5
    solution = []
    distance = math.inf

    nearestNeighbourSolver = NearestNeighbour.Solver()
    repeatedNearestNeighbourSolver = RepeatedNearestNeighbour.RepeatedSolver()
    greedySolver = Greedy.GreedySolver()
    insertionSolver = Insertion.InsertionSolver()
    optSolver = Opt.Opt()

    def __init__(self, distanceMatrix):
        self.distanceMatrix = distanceMatrix

    def changeWithEdges(self):

        self.withEdges = not self.withEdges

        self.displaySolution()

    def changeEdgeSize(self, size):

        self.edgesFontSize = int(size)
        self.displaySolution()

    def generateRandomGraph(self): # for the purpose of the test, the dimension of the graph are kept constant but the values are random

        dimension = 40
        distanceMatrix = np.random.randint(1, 40, size=(dimension, dimension))
        distanceMatrix = (distanceMatrix + distanceMatrix.T) / 2  # tranforms the matrix into a symmetric one

        for i in range(len(distanceMatrix)):
            distanceMatrix[i][i] = 0

        self.distanceMatrix = np.array(distanceMatrix)

        self.displayGraph()

    def getDistanceMatrix(self):
        return self.distanceMatrix

    def getSolution(self):
        return self.solution

    def display(self, matrix):

        plt.figure().clear()

        G = nx.from_numpy_array(matrix)

        labels = {}

        for i in range(len(matrix)):

            for j in range(len(matrix)):

                if matrix[i][j] != 0:
                    G.add_edge(i, j)
                    labels[(i, j)] = str(matrix[i][j])

        pos = nx.spring_layout(G)

        nx.draw(G, pos, with_labels=True, font_size=6, node_size=100)

        if self.withEdges:
            nx.draw_networkx_edge_labels(G, pos, edge_labels=labels, font_size=self.edgesFontSize)

        dirname = os.path.dirname(__file__)
        pathToSrc = str(dirname)[:len(dirname) - 4]
        pathToGraphPng = os.path.join(pathToSrc, r"resources\Graph.png") # this finds the path to the graph png regardless of the os

        plt.savefig(pathToGraphPng, format="PNG") # updates the image, which will then be displayed

        plt.close()

    def updateGraph(self, distanceMatrix):

        self.distanceMatrix = distanceMatrix

        self.displayGraph()

    def displayGraph(self): # to differentiate between the solution and the problem, as they both share the same output location

        self.display(self.distanceMatrix)

    def displaySolution(self):

        tempDistanceMatrix = np.copy(self.distanceMatrix)

        for i in range(len(self.solution) - 1): # tranforms the distance matrix into a path from a complete graph

            for j in range(len(tempDistanceMatrix)):
                if j != self.solution[i + 1]:
                    tempDistanceMatrix[self.solution[i]][j] = 0

        for j in range(len(tempDistanceMatrix)):

            if j != self.solution[0]:
                tempDistanceMatrix[self.solution[-1]][j] = 0

        self.display(tempDistanceMatrix)

    def solveNearestNeighbour(self):
        solutionAndDistance = self.nearestNeighbourSolver.solve(self.distanceMatrix)

        self.solution = solutionAndDistance[0]
        self.distance = solutionAndDistance[1]

        return self.solution

    def solveRepeatedNearestNeighbour(self):
        solutionAndDistance = self.repeatedNearestNeighbourSolver.solve(self.distanceMatrix)

        self.solution = solutionAndDistance[0]
        self.distance = solutionAndDistance[1]

        return self.solution

    def solveGreedy(self):

        solutionAndDistance = self.greedySolver.solve(self.distanceMatrix)

        self.solution = solutionAndDistance[0]
        self.distance = solutionAndDistance[1]

        return self.solution

    def solveInsertion(self):
        solutionAndDistance = self.insertionSolver.solve(self.distanceMatrix)

        self.solution = solutionAndDistance[0]
        self.distance = solutionAndDistance[1]

        return self.solution

    def getDistance(self):
        return self.distance

    def solveOpt(self):

        solutionAndDistance = self.optSolver.two_opt(self.solution, self.distanceMatrix, self.distance)
        self.solution = solutionAndDistance[0]
        self.distance = solutionAndDistance[1]

        return self.solution
