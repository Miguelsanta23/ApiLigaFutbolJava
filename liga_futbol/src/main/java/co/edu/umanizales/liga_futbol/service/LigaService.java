package co.edu.umanizales.liga_futbol.service;

import co.edu.umanizales.liga_futbol.model.Entrenador;
import co.edu.umanizales.liga_futbol.model.Equipo;
import co.edu.umanizales.liga_futbol.model.Jugador;
import co.edu.umanizales.liga_futbol.model.Liga;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LigaService {
    private Liga liga;

    public LigaService() {
        this.liga = new Liga("Liga de Fútbol");
        inicializarLiga();
    }

    private void inicializarLiga() {

        Entrenador entrenadorBarcelona = new Entrenador("Hansi", "Flick", 58, 20);
        Equipo barcelona = new Equipo("Barcelona", entrenadorBarcelona);

        List<Jugador> jugadoresBarcelona = Arrays.asList(
                new Jugador("Marc-André", "ter Stegen", 31, "Portero", 0),
                new Jugador("Alejandro", "Balde", 20, "Defensa", 2),
                new Jugador("Ronald", "Araújo", 24, "Defensa", 2),
                new Jugador("Iñigo", "Martínez", 32, "Defensa", 2),
                new Jugador("Jules", "Koundé", 25, "Defensa", 2),
                new Jugador("Pablo", "Gavi", 19, "Mediocampista", 8),
                new Jugador("Pedri", "González", 20, "Mediocampista", 8),
                new Jugador("Frenkie", "de Jong", 26, "Mediocampista", 8),
                new Jugador("Lamine", "Yamal", 16, "Delantero", 20),
                new Jugador("Robert", "Lewandowski", 35, "Delantero", 35),
                new Jugador("Raphael", "Raphina", 26, "Delantero", 20),
                new Jugador("Iñaki", "Peña", 24, "Portero", 0)
        );
        barcelona.setJugadores(jugadoresBarcelona);
        liga.getEquipos().add(barcelona);


        Entrenador entrenadorRealMadrid = new Entrenador("Carlo", "Ancelotti", 65, 20);
        Equipo realMadrid = new Equipo("RealMadrid", entrenadorRealMadrid);

        List<Jugador> jugadoresRealMadrid = Arrays.asList(
                new Jugador("Thibaut", "Courtois", 32, "Portero", 0),
                new Jugador("Eder", "Militao", 26, "Defensa", 2),
                new Jugador("Antonio", "Rudiger", 31, "Defensa", 2),
                new Jugador("Ferland", "Mendy", 29, "Defensa", 2),
                new Jugador("Daniel", "Carvajal", 32, "Defensa", 2),
                new Jugador("Federico", "Valverde", 26, "Mediocampista", 8),
                new Jugador("Eduardo", "Camavinga", 21, "Mediocampista", 8),
                new Jugador("Jude", "Bellingham", 21, "Mediocampista", 8),
                new Jugador("Kylian", "Mbappe", 25, "Delantero", 30),
                new Jugador("Vinicius", "Junior", 24, "Delantero", 20),
                new Jugador("Rodrygo", "Goes", 23, "Delantero", 20),
                new Jugador("Andriy", "Lunin", 25, "Portero", 0)
        );
        realMadrid.setJugadores(jugadoresRealMadrid);
        liga.getEquipos().add(realMadrid);

        Entrenador entrenadorManchesterCity = new Entrenador("Pep", "Guardiola", 52, 15);
        Equipo manCity = new Equipo("ManchesterCity", entrenadorManchesterCity);
        List<Jugador> jugadoresManchesterCity = Arrays.asList(
                new Jugador("Ederson", "Moraes", 30, "portero", 0),
                new Jugador("Kyle", "Walker", 33, "defensa", 2),
                new Jugador("Ruben", "Dias", 26, "defensa", 2),
                new Jugador("John", "Stones", 29, "defensa", 2),
                new Jugador("Nathan", "Ake", 28, "defensa", 2),
                new Jugador("Rodri", "Hernandez", 27, "mediocampista", 8),
                new Jugador("Kevin", "De Bruyne", 32, "mediocampista", 8),
                new Jugador("Bernardo", "Silva", 29, "mediocampista", 8),
                new Jugador("Erling", "Haaland", 23, "delantero", 60),
                new Jugador("Phil", "Foden", 23, "delantero", 20),
                new Jugador("Julian", "Alvarez", 23, "delantero", 25),
                new Jugador("Stefan", "Ortega", 31, "portero", 0)
        );
        manCity.setJugadores(jugadoresManchesterCity);
        liga.getEquipos().add(manCity);

        Entrenador entrenadorBayernMunchen = new Entrenador("Vincent", "KOmpany", 38, 4);
        Equipo bayern = new Equipo("BayernMunchen", entrenadorBayernMunchen);
        List<Jugador> jugadoresBayernMunchen = Arrays.asList(
                new Jugador("Manuel", "Neuer", 38, "portero", 0),
                new Jugador("Dayot", "Upamecano", 25, "defensa", 2),
                new Jugador("Kim", "Min-Jae", 27, "defensa", 2),
                new Jugador("Eric", "Dier", 30, "defensa", 2),
                new Jugador("Alphonso", "Davies", 23, "defensa", 2),
                new Jugador("Joshua", "Kimmich", 29, "mediocampista", 8),
                new Jugador("Leon", "Goretzka", 29, "mediocampista", 8),
                new Jugador("Thomas", "Muller", 35, "mediocampista", 8),
                new Jugador("Jamal", "Musiala", 21, "delantero", 25),
                new Jugador("Michael", "Olise", 22, "delantero", 20),
                new Jugador("Harry", "Kane", 31, "delantero", 40),
                new Jugador("Sven", "Ulreich", 36, "portero", 0)
        );
        bayern.setJugadores(jugadoresBayernMunchen);
        liga.getEquipos().add(bayern);

        Entrenador entrenadorArsenal = new Entrenador("Mikel", "Arteta", 42, 5);
        Equipo arsenal = new Equipo("Arsenal", entrenadorArsenal);

        List<Jugador> jugadoresArsenal = Arrays.asList(
                new Jugador("Aaron", "Ramsdale", 25, "Portero", 0),
                new Jugador("Ben", "White", 26, "Defensa", 2),
                new Jugador("William", "Saliba", 22, "Defensa", 2),
                new Jugador("Gabriel", "Magalhaes", 25, "Defensa", 2),
                new Jugador("Oleksandr", "Zinchenko", 26, "Defensa", 2),
                new Jugador("Martin", "Odegaard", 24, "Mediocampista", 8),
                new Jugador("Declan", "Rice", 24, "Mediocampista", 8),
                new Jugador("Kai", "Havertz", 24, "Mediocampista", 8),
                new Jugador("Bukayo", "Saka", 22, "Delantero", 20),
                new Jugador("Gabriel", "Jesus", 26, "Delantero", 24),
                new Jugador("Gabriel", "Martinelli", 22, "Delantero", 20),
                new Jugador("David", "Raya", 28, "Portero", 0)
        );
        arsenal.setJugadores(jugadoresArsenal);
        liga.getEquipos().add(arsenal);

        Entrenador entrenadorLiverpool = new Entrenador("Arne", "Slot", 46, 7);
        Equipo liverpool = new Equipo("Liverpool", entrenadorLiverpool);

        List<Jugador> jugadoresLiverpool = Arrays.asList(
                new Jugador("Alisson", "Becker", 31, "Portero", 0),
                new Jugador("Trent", "Alexander-Arnold", 25, "Defensa", 2),
                new Jugador("Virgil", "Van Dijk", 32, "Defensa", 2),
                new Jugador("Ibrahima", "Konate", 27, "Defensa", 2),
                new Jugador("Andy", "Robertson", 29, "Defensa", 2),
                new Jugador("Dominik", "Szoboszlai", 23, "Mediocampista", 8),
                new Jugador("Alexis", "Mac Allister", 24, "Mediocampista", 8),
                new Jugador("Curtis", "Jones", 22, "Mediocampista", 8),
                new Jugador("Mohamed", "Salah", 31, "Delantero", 35),
                new Jugador("Darwin", "Nuñez", 24, "Delantero", 25),
                new Jugador("Luis", "Diaz", 26, "Delantero", 20),
                new Jugador("Caoimhin", "Kelleher", 25, "Portero", 0)
        );
        liverpool.setJugadores(jugadoresLiverpool);
        liga.getEquipos().add(liverpool);

        Entrenador entrenadorChelsea = new Entrenador("Enzo", "Maresca", 44, 4);
        Equipo chelsea = new Equipo("Chelsea", entrenadorChelsea);

        List<Jugador> jugadoresChelsea = Arrays.asList(
                new Jugador("Robert", "Sanchez", 26, "Portero", 0),
                new Jugador("Reece", "James", 23, "Defensa", 2),
                new Jugador("Thiago", "Silva", 39, "Defensa", 2),
                new Jugador("Ben", "Chilwell", 26, "Defensa", 2),
                new Jugador("Wesley", "Fofana", 22, "Defensa", 2),
                new Jugador("Enzo", "Fernandez", 22, "Mediocampista", 8),
                new Jugador("Moises", "Caicedo", 22, "Mediocampista", 8),
                new Jugador("Conor", "Callagher", 23, "Mediocampista", 8),
                new Jugador("Christopher", "Nkunku", 26, "Delantero", 20),
                new Jugador("Nicolas", "Jackson", 22, "Delantero", 30),
                new Jugador("Raheem", "Sterling", 28, "Delantero", 15),
                new Jugador("djordje", "Petrovic", 24, "Portero", 0)
        );
        chelsea.setJugadores(jugadoresChelsea);
        liga.getEquipos().add(chelsea);




    }

    public List<Equipo> listarEquipos() {
        return liga.getEquipos();
    }

    public void agregarJugador(String nombreEquipo, Jugador jugador) {
        for (Equipo equipo : liga.getEquipos()) {
            if (equipo.getNombre().equals(nombreEquipo) && equipo.getJugadores().size() < 12) {
                equipo.getJugadores().add(jugador);
                break;
            }
        }
    }

    public double obtenerPromedioEdad(String nombreEquipo) {
        for (Equipo equipo : liga.getEquipos()) {
            if (equipo.getNombre().equals(nombreEquipo)) {
                return equipo.getJugadores().stream()
                        .mapToInt(Jugador::getEdad)
                        .average()
                        .orElse(0);
            }
        }
        return 0;
    }

    public Map<String, Jugador> obtenerGoleadoresPorEquipo() {
        Map<String, Jugador> goleadores = new HashMap<>();
        for (Equipo equipo : liga.getEquipos()) {
            goleadores.put(equipo.getNombre(),
                    equipo.getJugadores().stream()
                            .max(Comparator.comparingInt(Jugador::getGoles))
                            .orElse(null));
        }
        return goleadores;
    }

    public Map<String, List<Jugador>> filtrarJugadoresPorPosicion(String nombreEquipo) {
        for (Equipo equipo : liga.getEquipos()) {
            if (equipo.getNombre().equals(nombreEquipo)) {
                Map<String, List<Jugador>> jugadoresPorPosicion = new HashMap<>();
                jugadoresPorPosicion.put("Portero", new ArrayList<>());
                jugadoresPorPosicion.put("Defensa", new ArrayList<>());
                jugadoresPorPosicion.put("Mediocampista", new ArrayList<>());
                jugadoresPorPosicion.put("Delantero", new ArrayList<>());

                for (Jugador jugador : equipo.getJugadores()) {
                    jugadoresPorPosicion.get(jugador.getPosicion()).add(jugador);
                }
                return jugadoresPorPosicion;
            }
        }
        return new HashMap<>();
    }
}