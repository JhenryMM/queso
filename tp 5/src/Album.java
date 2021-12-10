import java.util.Objects;

public class Album {
    private String Titulo;
    private String Artista;
    Album (String titulo, String artista){
        this.Titulo=titulo;
        this.Artista=artista;
    }

    @Override
    public boolean equals(Object o){
        if ( this == o) return true;
        if ( o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(Titulo,album.Titulo) && Objects.equals(Artista, album.Artista);
    }


}
    //@Override
   // public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    Album album = (Album) o;
    //    return Objects.equals(Titulo, album.Titulo) && Objects.equals(Artista, album.Artista);
    //}