package com.example.atividaderecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListagemActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FilmeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listagem);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ArrayList<Filme> filmes = new ArrayList<>();
        carregarFilmes(filmes);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new FilmeAdapter(filmes);
        recyclerView.setAdapter(adapter);


    }


    private void carregarFilmes(ArrayList<Filme> filmes) {

        filmes.add(new Filme(
                "Interestelar",
                "Ficção científica",
                "2014",
                "As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos. Ao lado de Brand, Jenkins e Doyle, ele seguirá em busca de um novo lar.",
                "https://image.tmdb.org/t/p/original/tR1XVa5bxgdh2bRw2u0DzrgkO2l.jpg",
                R.drawable.interstellar
        ));

        filmes.add(new Filme(
                "Matrix",
                "Ficção científica",
                "1999",
                "O jovem programador Thomas Anderson é atormentado por estranhos pesadelos em que está sempre conectado por cabos a um imenso sistema de computadores do futuro. À medida que o sonho se repete, ele começa a desconfiar da realidade. Thomas conhece os misteriosos Morpheus e Trinity e descobre que é vítima de um sistema inteligente e artificial chamado Matrix, que manipula a mente das pessoas e cria a ilusão de um mundo real enquanto usa os cérebros e corpos dos indivíduos para produzir energia.",
                "https://www.themoviedb.org/t/p/w1280/lDqMDI3xpbB9UQRyeXfei0MXhqb.jpg",
                R.drawable.matrix
        ));

        filmes.add(new Filme(
                "O Senhor dos Anéis: A Sociedade do Anel",
                "Fantasia",
                "2001",
                "Após herdar um anel de seu tio, o hobbit Frodo participa da missão de salvar a Terra-Média do perverso Sauron. Ele precisa conduzir o Um Anel até a Montanha da Perdição e destruí-lo para sempre e, para isso, conta com a aliança de oito bravos companheiros contando com um mago, três hobbits, um elfo, um anão e dois homens.",
                "https://www.themoviedb.org/t/p/w1280/tlvsNCwWEIgwAM23aNzTmMIcPEZ.jpg",
                R.drawable.senhoraneis
        ));

        filmes.add(new Filme(
                "Gladiador",
                "Ação / Drama",
                "2000",
                "UNos dias finais do reinado de Marcus Aurelius, o imperador desperta a ira de seu filho Commodus ao tornar pública sua predileção em deixar o trono para Maximus, o comandante do exército romano. Sedento pelo poder, Commodus mata seu pai, assume a coroa e ordena a morte de Maximus, que consegue fugir antes de ser pego e passa a se esconder sob a identidade de um escravo e gladiador do Império Romano.",
                "https://www.themoviedb.org/t/p/w1280/4DUClyGA6OqjXv6yC0Imf6THGfp.jpg",
                R.drawable.gladiato
        ));

        filmes.add(new Filme(
                "O Poderoso Chefão",
                "Crime / Drama",
                "1972",
                "Em 1945, Don Corleone é o chefe de uma mafiosa família italiana de Nova York. Ele costuma apadrinhar várias pessoas, realizando importantes favores para elas, em troca de favores futuros. Com a chegada das drogas, as famílias começam uma disputa pelo promissor mercado. Quando Corleone se recusa a facilitar a entrada dos narcóticos na cidade, não oferecendo ajuda política e policial, sua família começa a sofrer atentados para que mudem de posição. É nessa complicada época que Michael, um herói de guerra nunca envolvido nos negócios da família, vê a necessidade de proteger o seu pai e tudo o que ele construiu ao longo dos anos.",
                "https://www.themoviedb.org/t/p/w1280/wOMxE93W6KcZTuCeNUByNTSaLLt.jpg",
                R.drawable.poderochefao
        ));

        filmes.add(new Filme(
                "Jurassic Park: O Parque dos Dinossauros",
                "Aventura / Ficção científica",
                "1993",
                "Um parque construído por um milionário tem dinossauros diversos como habitantes, extintos a sessenta e cinco milhões de anos. Isto é possível por ter sido encontrado um inseto fossilizado, que tinha sugado sangue destes dinossauros, de onde pôde-se isolar o DNA, o código químico da vida e, a partir deste ponto, recriá-los em laboratório. Mas, o que parecia ser um sonho se torna um pesadelo, quando a experiência sai do controle de seus criadores.",
                "https://www.themoviedb.org/t/p/w1280/mgjJ7FH4V3exsmoHwXrmsUhn0h1.jpg",
                R.drawable.jurassic
        ));

        filmes.add(new Filme(
                "Toy Story: Um Mundo de Aventuras",
                "Animação / Aventura",
                "1995",
                "Buzz Lightyear é o novo e sofisticado astronauta de brinquedo do garoto Andy. Buzz não imaginava que encontraria um rival: Woody, um cowboy de brinquedo que, dominado pelo ciúme, acredita ter perdido um lugar precioso no coração do seu dono. Os dois brinquedos vivem brigando até que vão parar nas garras do vizinho, um verdadeiro destruidor de brinquedos. Agora, mais do que nunca, Buzz e Woody precisam precisam se unir para escapar do perigo. Com a ajuda de seus amigos da caixa de brinquedos, eles vão viver uma incrível aventura.",
                "https://www.themoviedb.org/t/p/w1280/686F0CEPmI4ZXjFbWtIHQOBwnfI.jpg",
                R.drawable.toystory
        ));

        filmes.add(new Filme(
                "Batman: O Cavaleiro das Trevas (The Dark Knight)",
                "Ação / Crime",
                "2008",
                "Após dois anos desde o surgimento do Batman, os criminosos de Gotham City têm muito o que temer. Com a ajuda do tenente James Gordon e do promotor público Harvey Dent, Batman luta contra o crime organizado. Acuados com o combate, os chefes do crime aceitam a proposta feita pelo Coringa e o contratam para combater o Homem-Morcego.",
                "https://www.themoviedb.org/t/p/w1280/4lj1ikfsSmMZNyfdi8R8Tv5tsgb.jpg",
                R.drawable.thedark
        ));

        filmes.add(new Filme(
                "De Volta para o Futuro",
                "Ficção científica / Aventura",
                "1985",
                "Marty McFly, um típico adolescente americano dos anos 80, acidentalmente é enviado de volta ao ano de 1955 em um carro modificado para ser uma máquino do tempo, inventada por um cientista louco. Durante sua fantástica e maluca viagem no tempo, McFly tem que fazer com que seus futuros pais se encontrem e se apaixonem, para que assim ele possa ir de volta para o futuro.",
                "https://www.themoviedb.org/t/p/w1280/i996T0lI1fGtFEowiH3V6eZthL0.jpg",
                R.drawable.devoltaaofuturo
        ));

        filmes.add(new Filme(
                "Shrek",
                "Animação / Comédia",
                "2001",
                "Em um pântano distante vive Shrek, um ogro solitário que vê, sem mais nem menos, sua vida ser invadida por uma série de personagens de contos de fada. Todos eles foram expulsos de suas casas pelo maligno Lorde Farquaad. Determinado a recuperar a tranquilidade, Shrek faz um acordo com Farquaad: todos os personagens poderão retornar aos seus lares se ele e seu amigo Burro resgatarem uma princesa que foi aprisionada por um dragão.",
                "https://www.themoviedb.org/t/p/w1280/wxeqfC221YMptRRdzxlijAh7q8l.jpg",
                R.drawable.shrek
        ));
    }



}