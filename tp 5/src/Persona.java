import java.util.Objects;

public class Persona {
    protected String nombre;
    protected int dni;
    protected boolean sexo;

    public Persona(String nombre, int dni, boolean sexo) {
        this.dni= dni;
        this.nombre = nombre;
        this.sexo=  sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona= (Persona) o;
        return Objects.equals(nombre,persona.nombre) && Objects.equals(dni,persona.dni) && Objects.equals(sexo,persona.sexo);

    }
}
