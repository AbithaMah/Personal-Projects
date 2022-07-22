import unittest

import numpy as np

from tsp.trunk.src.main import Graph


class MyTestCase(unittest.TestCase):

    def testDraw(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)

        graph.displayGraph()

        self.assertEqual(True, True)

    def testNearestNeighbour(self):
        distanceMatrix = np.array([[0, 2], [2, 0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual([0, 1], graph.solveNearestNeighbour())

    def testDisplaySolution(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual([0, 2, 3, 1], graph.solveNearestNeighbour())

        graph.displaySolution()

    def testRandomGraph(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)

        graph.generateRandomGraph()


if __name__ == '__main__':
    unittest.main()
