import unittest

import numpy as np

from tsp.trunk.src.main import RepeatedNearestNeighbour, Graph


class MyTestCase(unittest.TestCase):

    def testGetMatrix(self):
        distanceMatrix = np.array([[0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual(graph.getDistanceMatrix(), np.array([[0]]))

    def testNIsOne(self):
        distanceMatrix = np.array([[0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual([0], graph.solveRepeatedNearestNeighbour())

    def testNIsTwo(self):
        distanceMatrix = np.array([[0, 2], [2, 0]])

        graph = Graph.Graph(distanceMatrix)
        self.assertEqual([0, 1], graph.solveRepeatedNearestNeighbour())

    def testNIsFour(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)
        self.assertEqual([0, 2, 3, 1], graph.solveRepeatedNearestNeighbour())

    def testSetNewGraph(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)
        self.assertEqual([0, 2, 3, 1], graph.solveRepeatedNearestNeighbour())

        graph.updateGraph(np.array([[0, 2], [2, 0]]))
        self.assertEqual([0, 1], graph.solveRepeatedNearestNeighbour())

if __name__ == '__main__':
    unittest.main()
