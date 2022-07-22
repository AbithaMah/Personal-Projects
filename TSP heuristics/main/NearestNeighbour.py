import math
import DistanceMatrix


class Solver:

    def __init__(self):

        self.totalDistance = 0
        self.solution = [0]

    def solve(self, distanceMatrix):

        self.solution = [0]
        self.totalDistance = 0

        distanceMatrix = DistanceMatrix.DistanceMatrix(distanceMatrix)

        for i in range(distanceMatrix.getLength() - 1):  # subtract one because the result has to be a cycle, therefore we lnnow the last element is the first

            shortest = math.inf  # setting the shortest to infinity so that at least one element will be shorter
            nextStop = 0

            for j in range(distanceMatrix.getLength()):

                if (distanceMatrix.getElement(self.solution[-1], j) < shortest) & (j not in self.solution):
                    nextStop = j
                    shortest = distanceMatrix.getElement(self.solution[-1], j)

            self.totalDistance += shortest  # increment the cost of the tour by the weight of the edge
            self.solution.append(nextStop)

        self.totalDistance += distanceMatrix.getElement(self.solution[-1], self.solution[0])

        return [self.solution, self.totalDistance]

    def getDistance(self):

        return self.totalDistance
