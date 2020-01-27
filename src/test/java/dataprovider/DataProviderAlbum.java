package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderAlbum {

    @DataProvider
    public Object[][] listaAlbum() {
        return new Object[][]{
                {4, 3,"TESTES AUTOMATIZADOS 1"},
                {102, 102,"TESTES AUTOMATIZADOS 2"},
                {103, 103,"TESTES AUTOMATIZADOS 3"},
                {104, 104,"TESTES AUTOMATIZADOS 4" },
                {1, 105,"TESTES AUTOMATIZADOS 5"},
                {1, 106,"TESTES AUTOMATIZADOS 6"},
                {1, 107,"TESTES AUTOMATIZADOS 7"},
                {1, 108,"TESTES AUTOMATIZADOS 8"},
                {1, 109,"TESTES AUTOMATIZADOS 9"},
                {1, 110,"TESTES AUTOMATIZADOS 10"}

        };
    }
}
