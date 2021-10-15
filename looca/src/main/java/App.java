public class App {
    public static void main(String[] args) {
        InfoMaquina infoMaquina = new InfoMaquina();

        infoMaquina.Maquina();

        TesteBancoDados testeBancoDados = new TesteBancoDados();

        testeBancoDados.enviaMaquina();





/*
        Timer timer = new Timer();
        final long segundos = 10000;
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {




            }
        };
        timer.scheduleAtFixedRate(tarefa, 10, segundos);
*/

    }
}
