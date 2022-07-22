import DistanceMatrix


class GreedySolver:

    def solve(self, distanceMatrix):

        nodesDegree = []
        connection = []  # store the edges forming the current tour, as the same edge can't be added twice
        solution = []
        totalDistance = 0

        distanceMatrix = DistanceMatrix.DistanceMatrix(distanceMatrix)

        for i in range(distanceMatrix.getLength()): # create a list of n size to store the degrees of each node
            nodesDegree.append(0)

        edges = distanceMatrix.getEdges()

        for y in range(len(edges)):

            if nodesDegree[edges[y][1]] < 2 and nodesDegree[edges[y][2]] < 2 and (  # degree can't exceed two as each node can only be traversed once
                    [edges[y][1], edges[y][2]] not in connection) and (
                    [edges[y][2], edges[y][1]] not in connection) and (
                    self.noSubTour(edges[y], solution) or len(solution) == distanceMatrix.getLength() - 1):  # checking that the edge doesn't form a sub tour

                solution.append(edges[y])
                connection.append([edges[y][1], edges[y][2]])
                nodesDegree[edges[y][1]] += 1
                nodesDegree[edges[y][2]] += 1


        for i in range(len(solution)):
            totalDistance += solution[i][0]

        return [self.formatSolution(solution), totalDistance]

    def noSubTour(self, newEdge, solution): # traverse the nodes connecting the edge, if the same node is repeated, then there is a sub tour

        nextStop = newEdge[1]
        tempsolution = solution.copy()

        for j in range(len(tempsolution)):

            for i in range(len(tempsolution)):

                if (nextStop == tempsolution[i][1]):
                    nextStop = tempsolution[i][2]
                    tempsolution.pop(i)
                    break

                if (nextStop == tempsolution[i][2]):
                    nextStop = tempsolution[i][1]
                    tempsolution.pop(i)
                    break

            if nextStop == newEdge[2]:
                return False

        return True

    def formatSolution(self, solution): # format the solution into a list of nodes in the correct order

        formattedSolution = [solution[0][1], solution[0][2]]

        for i in range(len(solution) - 2):

            for j in range(len(solution)):
                if solution[j][1] == formattedSolution[-1] and solution[j][2] not in formattedSolution:
                    formattedSolution.append(solution[j][2])
                elif solution[j][2] == formattedSolution[-1] and solution[j][1] not in formattedSolution:
                    formattedSolution.append(solution[j][1])

        return formattedSolution
