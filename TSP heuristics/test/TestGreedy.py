import unittest

import numpy as np

from tsp.trunk.src.main import Greedy, Graph


class MyTestCase(unittest.TestCase):

    def testReadGraph(self):
        distanceMatrix = np.array([[0]])

        graph = Graph.Graph(distanceMatrix)

        self.assertEqual(graph.getDistanceMatrix(), np.array([[0]]))  # add assertion here

    def testSolveFourNode(self):
        distanceMatrix = np.array(
            [[0, 4, 4, 7, 7, 8, 6, 8], [5, 0, 7, 6, 5, 8, 7, 6], [6, 4, 0, 6, 8, 9, 4, 7], [5, 4, 4, 0, 6, 4, 4, 10],
             [6, 9, 10, 7, 0, 8, 10, 9], [5, 6, 9, 5, 8, 0, 7, 7], [6, 9, 9, 10, 6, 7, 0, 5],
             [4, 6, 7, 6, 10, 5, 7, 0]])

        graph = Graph.Graph(distanceMatrix)


        self.assertEqual([2, 3, 1, 0], graph.solveGreedy())



if __name__ == '__main__':
    unittest.main()
