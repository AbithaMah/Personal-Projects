import unittest
import numpy as np

from tsp.trunk.src.main import NearestNeighbour, Graph


class MyTestCase(unittest.TestCase):

    def testSolveOneNode(self):
        distanceMatrix = np.array([[0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual([0], graph.solveNearestNeighbour())

    def testSolveTwoNode(self):
        distanceMatrix = np.array([[0, 2], [2, 0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual([0, 1], graph.solveNearestNeighbour())

    def testSolveFourNode(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)
        self.assertEqual([0, 2, 3, 1], graph.solveNearestNeighbour())

    def testSetNewGraph(self):
        distanceMatrix = np.array([[0, 5, 4, 10], [5, 0, 8, 5], [4, 8, 0, 3], [10, 5, 3, 0]])

        graph = Graph.Graph(distanceMatrix)
        self.assertEqual([0, 2, 3, 1], graph.solveNearestNeighbour())

        graph.updateGraph(np.array([[0, 2], [2, 0]]))
        self.assertEqual([0, 1], graph.solveNearestNeighbour())

    def testGetTotalDistance(self):
        distanceMatrix = np.array([[0, 2], [2, 0]])

        graph = Graph.Graph(distanceMatrix)
        graph.solveNearestNeighbour()

        self.assertEqual(2, graph.getDistance())


if __name__ == '__main__':
    unittest.main()
