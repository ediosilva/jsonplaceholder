package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderPosts {

    @DataProvider
    public Object[][] listaPosts() {
        return new Object[][]{
                {1, "Titulo 1", "TESTES AUTOMATIZADOS 1"},
                {1, "Titulo 2", "TESTES AUTOMATIZADOS 2"},
                {1, "Titulo 5", "TESTES AUTOMATIZADOS 3"},
                {1, "Titulo 6", "TESTES AUTOMATIZADOS 4"},
                {1, "Titulo 7", "TESTES AUTOMATIZADOS 5"},
                {1, "Titulo 8", "TESTES AUTOMATIZADOS 6"},
                {1, "Titulo 9", "TESTES AUTOMATIZADOS 7"},
                {1, "Titulo 10", "TESTES AUTOMATIZADOS 8"},
                {1, "Titulo 11", "TESTES AUTOMATIZADOS 9"},
                {1, "Titulo 12", "TESTES AUTOMATIZADOS 10"}

        };
    }

    @DataProvider
    public Object[][] listaComID() {
        return new Object[][]{
                {1, 1, "Titulo 1", "TESTES AUTOMATIZADOS 1"},
                {1, 2, "Titulo 2", "TESTES AUTOMATIZADOS 2"},
                {1, 3, "Titulo 5", "TESTES AUTOMATIZADOS 3"},
                {1, 4, "Titulo 6", "TESTES AUTOMATIZADOS 4"},
                {1, 5, "Titulo 7", "TESTES AUTOMATIZADOS 5"},
                {1, 6, "Titulo 8", "TESTES AUTOMATIZADOS 6"},
                {1, 7, "Titulo 9", "TESTES AUTOMATIZADOS 7"},
                {1, 7, "Titulo 10", "TESTES AUTOMATIZADOS 8"},
                {1, 8, "Titulo 11", "TESTES AUTOMATIZADOS 9"},
                {1, 9, "Titulo 12", "TESTES AUTOMATIZADOS 10"}

        };
    }

    @DataProvider
    public Object[][] idDelete() {
        return new Object[][]{
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
                {8},
                {9},
                {10}

        };
    }
}
