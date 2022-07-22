import math
import DistanceMatrix


class InsertionSolver:

    def solve(self, distanceMatrix):

        solution = [0, 1, 2]  # the incomplete tour is always composed of the first three nodes

        distanceMatrix = DistanceMatrix.DistanceMatrix(distanceMatrix)

        totalDistance = distanceMatrix.getElement(0, 1) + distanceMatrix.getElement(1, 2) + distanceMatrix.getElement(2,  # add the three current edges to the total tour cost
                                                                                                                      0)

        while len(solution) < distanceMatrix.getLength():

            shortest = math.inf # note that the shortest gets reset after every loop

            for j in range(distanceMatrix.getLength()):

                if j not in solution: # the same node can't be traversed twice

                    newVertex = j

                    for i in range(len(solution)):

                        vertex1 = solution[i - 1]
                        vertex2 = solution[i]
                        edgeLength = distanceMatrix.getElement(vertex1, vertex2)

                        tempDistance = totalDistance + distanceMatrix.getElement(vertex1, newVertex) + distanceMatrix.getElement(newVertex, vertex2) - edgeLength

                        if tempDistance < shortest:
                            shortest = tempDistance
                            appendPosition = i
                            optimalVertex = newVertex

            totalDistance = shortest
            solution.insert(appendPosition, optimalVertex)

        return [solution, totalDistance]
