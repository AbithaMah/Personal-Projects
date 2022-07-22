import os
import tkinter as tk
from tkinter import messagebox
import time
import networkx as nx
import tsplib95
from PIL import ImageTk, Image
import Graph


class Interface: # handles the user GUI

    def __init__(self): # instantiates the attributs and the buttons

        self.variable = None
        self.graph = Graph.Graph(None)
        self.lastButton = None
        self.fileName = "N\A"
        self.runtime = 0

        self.window = tk.Tk()

        self.nearestNeighbourButton = tk.Button(self.window, text="Nearest Neighbour",
                                                command=self.plotNearestNeighbour,
                                                width=25,
                                                height=6)

        self.repeatedNearestNeighbourButton = tk.Button(self.window, text="Repeated Nearest Neighbour",
                                                        command=self.plotRepeatedNearestNeighbour, width=25,
                                                        height=6)

        self.insertionButton = tk.Button(self.window, text="Insertion", command=self.plotInsertion, width=25,
                                         height=6)

        self.greedyButton = tk.Button(self.window, text="Greedy", command=self.plotGreedy, width=25,
                                      height=6)

        self.optButton = tk.Button(self.window, text="Apply 2 opt", command=self.plotOpt, width=25,
                                   height=6)

        self.graphButton = tk.Button(self.window, text="Display Graph", command=self.displayGraph, width=25,
                                     height=6)
        self.solutionButton = tk.Button(self.window, text="Solution", command=self.displaySolution, width=91, height=6)

        self.generateRandomGraphButton = tk.Button(self.window, text="Generate Random Graph",
                                                   command=self.generateRandomGraph, width=25,
                                                   height=6)

    def changeEdges(self, selected):

        self.graph.changeWithEdges()
        self.updateImage()

    def changeEdgeSize(self, selected):

        self.graph.changeEdgeSize(selected)
        self.updateImage()

    def generateRandomGraph(self):

        self.graph.generateRandomGraph()
        self.lastButton = None

        self.fileName = "N\A"

        self.updateImage()

    def displaySolution(self):

        dirname = os.path.dirname(__file__)
        pathToSrc = str(dirname)[:len(dirname) - 4]
        pathToBestSolution = os.path.join(pathToSrc, r"resources\bestSolutions.txt")

        with open(pathToBestSolution) as textFile:
            solutions = [line.split() for line in textFile]

        optimalSolution = "N\A"


        for i in range(len(solutions)):
            if solutions[i][0] == self.fileName[:-4] or solutions[i][0] == self.fileName[:-5]:
                optimalSolution = solutions[i][1]

        tk.messagebox.showinfo(title="Solution",
                               message="total distance:   " + str(self.graph.getDistance()) + "\nsolution:   " + str(
                                   self.graph.getSolution()) + "\noptimal solution:   " + optimalSolution + "\nruntime:   " + str(
                                   self.runtime))

    def changeGraph(self, name): # updates the problem once the user selects a new one

        dirname = os.path.dirname(__file__)
        pathToSrc = str(dirname)[:len(dirname) - 4]
        pathToProblems = os.path.join(pathToSrc, r"resources\tsplib\problems")

        pathToProblem = pathToProblems + "\\" + name

        problem = tsplib95.loaders.load(pathToProblem)

        G = problem.get_graph(normalize=True)

        distanceMatrix = nx.to_numpy_array(G)

        self.lastButton = None

        self.graph.updateGraph(distanceMatrix)

        self.fileName = name

        self.updateImage()

    def plotNearestNeighbour(self):

        if self.lastButton != "NearestNeighbour":

            start_time = time.time()
            self.graph.solveNearestNeighbour()
            self.runtime = time.time() - start_time # calculates the run time by subtracting the time recorded after to the time recorded before the function

            self.graph.displaySolution()

            self.updateImage()

            self.lastButton = "NearestNeighbour"

    def plotRepeatedNearestNeighbour(self):

        if self.lastButton != "RepeatedNearestNeighbour":
            start_time = time.time()
            self.graph.solveRepeatedNearestNeighbour()
            self.runtime = time.time() - start_time

            self.graph.displaySolution()

            self.updateImage()
            self.lastButton = "RepeatedNearestNeighbour"

    def plotGreedy(self):

        if self.lastButton != "Greedy":
            start_time = time.time()
            self.graph.solveGreedy()
            self.runtime = time.time() - start_time

            self.graph.displaySolution()
            self.updateImage()
            self.lastButton = "Greedy"

    def plotInsertion(self):

        if self.lastButton != "Insertion":
            start_time = time.time()
            self.graph.solveInsertion()
            self.runtime = time.time() - start_time

            self.graph.displaySolution()

            self.updateImage()
            self.lastButton = "Insertion"

    def plotOpt(self):

        if self.lastButton != "Opt":
            start_time = time.time()
            self.graph.solveOpt()
            self.runtime = time.time() - start_time

            self.graph.displaySolution()
            self.updateImage()
            self.lastButton = "Opt"

    def displayGraph(self):

        if self.lastButton != "Graph":
            self.graph.displayGraph()

            self.updateImage()

            self.lastButton = "Graph"

    def updateImage(self):

        dirname = os.path.dirname(__file__)
        pathToSrc = str(dirname)[:len(dirname) - 4]
        pathToGraphPng = os.path.join(pathToSrc, r"resources\Graph.png")

        img = ImageTk.PhotoImage(Image.open(pathToGraphPng))

        updatedImage = ImageTk.PhotoImage(Image.open(pathToGraphPng))
        self.imageLabel.config(image=updatedImage)
        self.imageLabel.image = updatedImage

    def displayInterface(self):

        self.window.geometry("1024x900")

        dirname = os.path.dirname(__file__)
        pathToSrc = str(dirname)[:len(dirname) - 4]
        pathToGraphPng = os.path.join(pathToSrc, r"resources\Graph.png")

        img = ImageTk.PhotoImage(Image.open(pathToGraphPng))

        self.imageLabel = tk.Label(self.window, image=img, borderwidth=2, relief="groove")
        self.imageLabel.pack()

        self.nearestNeighbourButton.place(x=188, y=500)

        self.repeatedNearestNeighbourButton.place(x=419, y=500)

        self.insertionButton.place(x=650, y=500)

        self.greedyButton.place(x=188, y=640)

        self.optButton.place(x=419, y=640)

        self.graphButton.place(x=650, y=640)

        self.solutionButton.place(x=188, y=780)

        self.generateRandomGraphButton.place(x=0, y=200)

        dirname = os.path.dirname(__file__)
        pathToSrc = str(dirname)[:len(dirname) - 4]
        pathToProblems = os.path.join(pathToSrc, r"resources\tsplib\problems")
        problems = os.listdir(pathToProblems)
        self.variable = tk.StringVar(self.window)
        self.variable.set(problems[0])  # default value
        options = tk.OptionMenu(self.window, self.variable, command=self.changeGraph, *problems)
        options.place(x=875, y=0)

        answer = ["no ", "yes"]
        self.selected = tk.StringVar(self.window)
        self.selected.set(answer[0])
        withEdges = tk.OptionMenu(self.window, self.selected, *answer, command=self.changeEdges)
        withEdges.place(x=120, y=0)
        withEdgesLabel = tk.Label(self.window, text="Display Edges Length", borderwidth=2)
        withEdgesLabel.place(x=0, y=6)

        sizes = ["1    ", "2    ", "3    ", "4    ", "5    ", "6    ", "7    ", "8    ", "9    ", "10    "]
        self.edgeSizeFont = tk.StringVar(self.window)
        self.edgeSizeFont.set(sizes[4])
        edgesSize = tk.OptionMenu(self.window, self.edgeSizeFont, *sizes, command=self.changeEdgeSize)
        edgesSize.place(x=120, y=40)
        edgesSizeLabel = tk.Label(self.window, text="Edges Font Size", borderwidth=2)
        edgesSizeLabel.place(x=0, y=46)

        self.generateRandomGraph()
        self.plotNearestNeighbour()
        self.window.mainloop()


if __name__ == '__main__':
    interface = Interface()
    interface.displayInterface()
