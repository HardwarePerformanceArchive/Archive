from traverse \
    import TravelAndListFiles


class Archive:
    def __init__(self, datasetPath):
        self.dataset = datasetPath
        self.init()


    def init(self):
        list = TravelAndListFiles(self.dataset)

        for idx in range(0, len(list), 1):
            current = list[idx]
            

    def get_dataset(self):
        return self.dataset

    def set_dataset(self, dataset):
        self.dataset = dataset
    

    