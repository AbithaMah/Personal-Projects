class DistanceMatrix:

    def __init__(self, distanceMatrix):
        self.distanceMatrix = distanceMatrix


    def getLength(self):
        return len(self.distanceMatrix)


    def getElement(self, x, y):
        return self.distanceMatrix[x, y]

    def getEdges(self):

        edges = []

        for j in range(len(self.distanceMatrix)):

            for z in range(len(self.distanceMatrix)):

                if j != z:

                    if len(edges) == 0:
                        edges.append([self.distanceMatrix[j][z], j, z])

                    else:

                        tempEdge = [self.distanceMatrix[j][z], j, z]
                        for x in range(len(edges)):

                            if tempEdge[0] < edges[x][0]:
                                floatEdge = tempEdge
                                tempEdge = edges[x]
                                edges[x] = floatEdge

                        edges.append(tempEdge)

        return edges