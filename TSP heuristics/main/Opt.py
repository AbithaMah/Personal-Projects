class Opt:

    def distanceDelta(self, distanceMatrix, n1, n2, n3, n4):

        return distanceMatrix[n1][n3] + distanceMatrix[n2][n4] - distanceMatrix[n1][n2] - distanceMatrix[n3][n4]

    def two_opt(self, solution, distanceMatrix, distance):


        length = len(solution)
        change = True

        while change:


            change = False


            for i in range(1, length - 2):


                for j in range(i + 1, length):


                    if j - i == 1:
                        continue



                    distanceDelta = self.distanceDelta(distanceMatrix, solution[i-1], solution[i], solution[j-1], solution[j]) # if the 2 opt move yields a short tour, we update it

                    if distanceDelta < 0:
                        solution[i:j] = solution[j-1:i-1:-1]
                        distance += distanceDelta
                        change = True
                    




        return [solution, distance]
