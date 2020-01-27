package dataprovider;
import org.testng.annotations.DataProvider;

public class DataProviderUsuario {


    @DataProvider
    public Object[][] getUsuarios() {
        return new Object[][]{
                {"Leanne Graham", "Sincere@april.biz",1},
                {"Ervin Howell", "Shanna@melissa.tv",2},
                {"Clementine Bauch", "Nathan@yesenia.net",3},
                {"Patricia Lebsack", "Julianne.OConner@kory.org",4},
                {"Chelsey Dietrich", "Lucio_Hettinger@annie.ca",5},
                {"Mrs. Dennis Schulist", "Karley_Dach@jasper.info",6},
                {"Kurtis Weissnat", "Telly.Hoeger@billy.biz",7},
                {"Nicholas Runolfsdottir V", "Sherwood@rosamond.me",8},
                {"Glenna Reichert", "Chaim_McDermott@dana.io",9},
                {"Clementina DuBuque", "Rey.Padberg@karina.biz",10}
        };
    }
}
