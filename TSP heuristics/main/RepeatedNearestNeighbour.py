import math
import DistanceMatrix


class RepeatedSolver:

    def solve(self, distanceMatrix):

        self.optimalSolution = [0]
        self.optimalDistance = math.inf

        distanceMatrix = DistanceMatrix.DistanceMatrix(distanceMatrix)

        for z in range(distanceMatrix.getLength()):

            solution = [z] # the starting node of the tour keeps changing until the best one is selected

            totalDistance = 0

            for i in range(distanceMatrix.getLength() - 1):

                shortest = math.inf
                nextStop = 0

                for j in range(distanceMatrix.getLength()):

                    if (distanceMatrix.getElement(solution[-1], j) < shortest) & (j not in solution):
                        nextStop = j
                        shortest = distanceMatrix.getElement(solution[-1], j)

                totalDistance += shortest
                solution.append(nextStop)

                if totalDistance > self.optimalDistance:  # once the cost exceeds the cost of the best solution, we can break the loop to save time
                    break

            totalDistance += distanceMatrix.getElement(solution[-1], solution[0])

            if totalDistance < self.optimalDistance:  # if the cost is lesser than the previous best tour, we update both the tour and the cost
                self.optimalDistance = totalDistance
                self.optimalSolution = solution

        return [self.optimalSolution, self.optimalDistance]
