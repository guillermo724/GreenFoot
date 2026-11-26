import greenfoot.*;

public class Nether extends World
{
    /**
     * Crea 3 filas de Pokémon: Garchomp, Gabite y Ginble.
     */
    public void createSouldyers()
    {
        for (int fila = 0; fila < 3; fila++)
        {
            int y = 300 + fila * 100;   // filas en y = 300, 400 y 500

            for (int i = 0; i < 3; i++)
            {
                int x = 400 + i * 100;

                if (i % 3 == 0)
                {
                    addObject(new Garchomp(), x, y);
                }
                else if (i % 3 == 1)
                {
                    addObject(new Gabite(), x, y);
                }
                else
                {
                    addObject(new Ginble(), x, y);
                }
            }
        }
    }

    /**
     * Constructor del mundo Nether.
     */
    public Nether()
    {
        super(1000, 700, 1);

        Player babyAdventurer = new Player();
        addObject(babyAdventurer, 0, 0);
        createSouldyers();
    }
}