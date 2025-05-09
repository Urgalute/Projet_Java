package com.herobook;

import com.herobook.controller.GameController;
import com.herobook.model.*;
import com.herobook.view.SwingUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a sample scenario
        Scenario scenario = createSampleScenario();

        // Create and setup the game controller
        GameController gameController = new GameController();
        gameController.loadScenario(scenario);

        // Launch the UI
        SwingUtilities.invokeLater(() -> {
            SwingUI ui = new SwingUI(gameController);
            ui.setVisible(true);
        });
    }

    private static Scenario createSampleScenario() {
        Scenario scenario = new Scenario("L'Aventure du Héros", "Une aventure épique vous attend!");

        Chapter chapter5 = new Chapter("5", "Le Début de l'Aventure",
                "5\n" +
                        "Les bois semblent se refermer sur vous quand vous y pénétrez. Au bout de\n" +
                        "quelques instants le sentier disparaît, et vous en êtes réduit à vous frayer un chemin\n" +
                        "de votre mieux parmi les taillis, les buissons et les ronces. La progression est de\n" +
                        "plus en plus difficile , de plus en plus tortueuse, et vous finissez par vous rendre\n" +
                        "compte que vous êtes complètement perdu. Vous vous arrêtez un instant, et vous\n" +
                        "vous grattez le sommet du crâne. Ce geste n'améliorant en rien votre situation, vous\n" +
                        "prenez la seule décision possible : lancer deux dés pour voir si vous pouvez vous\n" +
                        "sortir de là.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 31.\n" +
                        "de 7 à 12 : rendez-vous au 17.");
        chapter5.addChoice(new Choice("Page 31", "31"));
        chapter5.addChoice(new Choice("Page 17", "17"));

        Chapter chapter6 = new Chapter("6", "",
            "6\n" +
                    "Il vous a mordu à la rotule ! Cette sale petite bête a bondi, et elle vous a planté ses\n" +
                    "crocs répugnants dans le genou jusqu'à l'os, vous infligeant une cruelle douleur. Si\n" +
                    "vous voulez combattre cet animal déduisez 2 points à chaque fois que vous lanceriez\n" +
                    "les dés pour vous-même, en raison de votre jambe blessée.\n" +
                    "Le Lapin Blanc possède 25 POINTS DE VIE, et des crocs qui lui valent + 3 Points de\n" +
                    "Dommage. Il n'a besoin que d'un minimum de 5 pour attaquer, à condition qu'il frappe\n" +
                    "en dessous d'un mètre de hauteur (ce qu'il fera, car il n'est pas idiot).\n" +
                    "Si vous préférez vous enfuir, rendez-vous au 5. Si vous combattez le Lapin Blanc, et\n" +
                    "qu'il vous tue, rendez-vous au 14.\n" +
                    "si vous décidez de livrer combat, et si vous êtes vainqueur, vous pouvez retourner au\n" +
                    "65 ou au 11 (où vous trouverez sans aucun doute un deuxième Lapin blanc), pour faire\n" +
                    "un nouveau choix, si à un moment quelconque du combat, le Lapin blanc vous porte\n" +
                    "trois coups consécutifs, rendez-vous au 26.\n");

        chapter6.addChoice(new Choice("Page 5", "5"));
        chapter6.addChoice(new Choice("Page 14", "14"));
        chapter6.addChoice(new Choice("Page 65", "65"));
        chapter6.addChoice(new Choice("Page 11", "11"));
        chapter6.addChoice(new Choice("Page 26", "26"));

        Chapter chapter7 = new Chapter("7", "",
                "7\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter7.addChoice(new Choice("Page 35", "35"));
        chapter7.addChoice(new Choice("Page 27", "27"));

        Chapter chapter8 = new Chapter("8", "",
                "8\n" +
                        "Toujours perdu dans le brouillard, Pip. Continuez à errer jusqu'à ce que vous arriviez\n" +
                        "au 42.\n");

        chapter8.addChoice(new Choice("Page 42", "42"));

        Chapter chapter9 = new Chapter("9", "",
                "9\n" +
                        "Vous avez l'impression d'avoir parcouru des kilomètres, avec le village toujours en\n" +
                        "vue, mais cependant toujours aussi éloigné. Vous êtes maintenant épuisé, affamé, et\n" +
                        "vous décidez donc de vous reposer et de manger une partie de vos provisions. Vous\n" +
                        "vous écartez de la piste et vous vous asseyez dans l'herbe, adossé à une souche\n" +
                        "d'arbre près d'un taillis. Un clair ruisseau où vous pouvez boire coule à proximité. Le\n" +
                        "village reste en vue, ni plus près, ni plus loin. Au moment où vous ouvrez votre sac,\n" +
                        "une voix déclare derrière vous : « Bon demain, Votre Honneur ». Vous vous levez\n" +
                        "d'un bond, prêt à tirer votre épée, mais vous hésitez. Un petit homme minuscule,\n" +
                        "habillé de brun et de vert, a émergé du taillis et il vous regarde, les yeux noirs et\n" +
                        "pétillants. Il ne porte aucune arme et ne semble guère dangereux. « Votre casse-\n" +
                        "croûte est bien appétissant, Votre Honneur, dit le petit homme. Une bouchée ou\n" +
                        "deux ne ferait pas de mal à un pauvre diable qui n'a pas mangé depuis une\n" +
                        "semaine.»\n" +
                        "Proposez-vous au minuscule affamé de partager votre repas avec lui ? Rendez-vous\n" +
                        "alors au 36. Lui faites-vous remarquez poliment que vous avez un long voyage en\n" +
                        "perspective et que vous aurez besoin pour vous-même de vos provisions ? Rendez-\n" +
                        "vous dans ce cas au 22.\n");

        chapter9.addChoice(new Choice("Page 36", "36"));
        chapter9.addChoice(new Choice("Page 22", "22"));

        Chapter chapter10 = new Chapter("10", "",
                "10\n" +
                        "Un clignement de paupières. Un frémissement. Vous êtes dans le village, Pip. Cela ne\n" +
                        "fait aucun doute. En plein village, sans avoir fait un pas de plus. Comme c'est étrange.\n" +
                        "C'est un joli village. Petit mais ravissant. Des maisons au toit de chaume... une pelouse\n" +
                        "une pittoresque petite église en pierre. Et pas une âme en vue. Pas âme qui vive. vous\n" +
                        "vous trouvez sur un sentier de terre battue, un peu boueux et creusé d'ornières, comme\n" +
                        "s'il servait souvent. Une longue bâtisse se dresse au nord-est de l’endroit où vous êtes\n" +
                        "et, vers l'est, s'étend le plus étrange jardin que vous ayez jamais vu. Toutes les plantes\n" +
                        "semblent faites de pierre et il est parsemé de statues de monstres. Au-delà du jardin se\n" +
                        "trouvent les chaumières et, derrière les chaumières, vous apercevez le clocher de\n" +
                        "l'église. Le village tout entier est enclos par une robuste palissade en bois, solidement\n" +
                        "construite et, à en juger par son aspect, extrêmement difficile à escalader. Au sud-est\n" +
                        "se trouvent d'autres chaumières et un grand mur en pierre. Maintenant, reportez-vous à\n" +
                        "la carte du village. Elle indique le lieu où vous\n" +
                        "vous trouvez actuellement, et vous pouvez constater que tous les bâtiments, ainsi que\n" +
                        "divers endroits du village portent un numéro. Vous pouvez explorer la Pierre-qui-Mue\n" +
                        "à votre guise. Vous êtes libre d'aller où bon vous semble, libre de tout voir. ?pour cela,\n" +
                        "il vous suffira de vous rendre au paragraphe portant le numéro que vous aurez choisi\n" +
                        "sur la carte.\n" +
                        "Ah. une dernière chose... Avez-vous remarqué qu'il n'y a pas d'issue ?\n");

        chapter10.addChoice(new Choice("Page 20", "20"));
        chapter10.addChoice(new Choice("Page 28", "28"));
        chapter10.addChoice(new Choice("Page 55", "55"));
        chapter10.addChoice(new Choice("Page 24", "24"));
        chapter10.addChoice(new Choice("Page 61", "61"));
        chapter10.addChoice(new Choice("Page 52", "52"));
        chapter10.addChoice(new Choice("Page 44", "44"));
        chapter10.addChoice(new Choice("Page 50", "50"));
        chapter10.addChoice(new Choice("Page 39", "39"));
        chapter10.addChoice(new Choice("Page 48", "48"));
        chapter10.addChoice(new Choice("Page 89", "89"));
        chapter10.addChoice(new Choice("Page 79", "79"));
        chapter10.addChoice(new Choice("Page 27", "27"));
        chapter10.addChoice(new Choice("Page 40", "40"));
        chapter10.addChoice(new Choice("Page 66", "66"));
        chapter10.addChoice(new Choice("Page 47", "47"));
        chapter10.addChoice(new Choice("Page 30", "30"));
        chapter10.addChoice(new Choice("Page 54", "54"));
        chapter10.addChoice(new Choice("Page 63", "63"));
        chapter10.addChoice(new Choice("Page 41", "41"));
        chapter10.addChoice(new Choice("Page 72", "72"));
        chapter10.addChoice(new Choice("Page 69", "69"));
        chapter10.addChoice(new Choice("Page 33", "33"));
        chapter10.addChoice(new Choice("Page 43", "43"));
        chapter10.addChoice(new Choice("Page 45", "45"));
        chapter10.addChoice(new Choice("Page 38", "38"));
        chapter10.addChoice(new Choice("Page 74", "74"));

        Chapter chapter11 = new Chapter("11", "",
                "11\n" +
                        "Vous êtes arrivé à une clairière. Eh bien, c'est toujours plus agréable que de vous\n" +
                        "frayer un chemin dans les taillis, bien qu'il n'y ait pas grand-chose à voir, ici. La\n" +
                        "clairière elle-même est presque ronde, et elle fait environ six à huit mètres de\n" +
                        "diamètre. En son Centre pousse un grand chêne et un lapin assis sur un petit monticule\n" +
                        "à proximité de son terrier, vous considère d'un air soupçonneux. Et c'est à peu près\n" +
                        "tout, à l'exception de quelques campanules qui poussent çà et là.\n" +
                        "Alors, qu'allez-vous faire maintenant ? Vous asseoir sous l'arbre pour\n" +
                        "réfléchir un instant ? Mais attendez donc ! C'est un lapin blanc qui est assis\n" +
                        "là ! Un Lapin Blanc ! Vous savez bien, un Lapin Blanc, comme dans Alice\n" +
                        "au Pays des Merveilles ! Non, ça ne peut pas être ce genre de Lapin Blanc,\n" +
                        "n'est-ce pas ? Mais si, figurez-vous ! C'est très possible ! Vous vivez une\n" +
                        "aventure magique et on ne peut rien trouver de plus magique qu'un Lapin\n" +
                        "Blanc, pas vrai ? Ce terrier de lapin est peut -être l'entrée du Pays des\n" +
                        "Merveilles. Le Sinistre Royaume des Morts est peut -être une autre façon\n" +
                        "d'appeler le Pays des Merveilles ! C'est possible, après tout. Alors, qu'allez -\n" +
                        "vous faire, Pip ?\n" +
                        "Si vous voulez essayer de bavarder avec le Lapin, rendez-vous au 6. Si vous\n" +
                        "préférez vous asseoir sous l'arbre pour réfléchir un instant, rendez-vous au\n" +
                        "46.\n");

        chapter11.addChoice(new Choice("Page 6", "6"));
        chapter11.addChoice(new Choice("Page 46", "46"));

        Chapter chapter12 = new Chapter("12", "",
                "12\n" +
                        "Bravo, Pip, la magie devrait opérer, à condition que vous vous y preniez\n" +
                        "correctement. Rendez-vous au 23.\n");

        chapter12.addChoice(new Choice("Page 23", "23"));

        Chapter chapter13 = new Chapter("13", "",
                "13\n" +
                        "Qu'est-ce que c'est ? On dirait une brume de chaleur, mais il ne fait pas chaud à ce\n" +
                        "point. Et une brume de chaleur ne se manifeste pas comme cela. Une sorte de\n" +
                        "vibration anime l'air devant vous. Mais une vibration bien délimitée de deux mètres de\n" +
                        "haut de plus d'un mètre de large. On dirait une porte. Un porche vibratoire. Derrière,\n" +
                        "se profile le village, toujours aussi éloigné.\n" +
                        "Allez-vous franchir ce porche vibratoire? Si oui rendez-vous au 10.\n" +
                        "Préférez-vous prudemment le contourner ? Rendez- vous alors au 33.\n");

        chapter13.addChoice(new Choice("Page 10", "10"));
        chapter13.addChoice(new Choice("Page 33", "33"));

        Chapter chapter14 = new Chapter("14", "",
                "14\n" +
                        "Vous ouvrez lentement les yeux. Quelque part dam le lointain, un orchestre invisible\n" +
                        "joue une Marche Funèbre. Vous êtes au milieu de la Grotte de Cristal Merlin est\n" +
                        "penché sur vous, l'air extrêmement mécontent.\n" +
                        ".— Alors, tu as réussi à te faire tuer, n'est-ce pas ? Quelle négligence ! Eh bien, tu n'as\n" +
                        "plus qu'à recommencer depuis le début. Et tâche de mieux t'y prendre à l'avenir,\n" +
                        "sinon c'en est fait à tout jamais de ma pension. Jette les dés comme je te l'ai déjà\n" +
                        "montré pour te procurer un peu d'argent. Car il faut que tu remplaces le matériel que\n" +
                        "tu as perdu. Tiens, voilà les listes. Tu as toujours ta carte au moins ? C'est heureux !\n" +
                        "Allez ! va retrouver ta vache, et choisis le bon chemin, cette fois.\n" +
                        "Là-dessus, il s'éloigne en marmonnant dans sa barbe à propos des jeunes de nos\n" +
                        "jours... tandis que lentement , mais inexorablement, la grotte commence à s'effacer,\n" +
                        "pour disparaître bientôt complètement.\n");

        chapter14.addChoice(new Choice("Vous êtes mort !", "Death"));

        Chapter chapter15 = new Chapter("15", "",
                "15\n" +
                        "La décision que vous venez de prendre ne vaut rien dans ces circonstances. Retournez\n" +
                        "d'où vous venez, et faites un nouveau choix. Mais vous perdez votre mordant, si bien\n" +
                        "que c'est votre adversaire qui frappe le premier.\n");

        chapter15.addChoice(new Choice("Page 19", "19"));

        Chapter chapter16 = new Chapter("16", "",
                "16\n" +
                        "vous poursuivez péniblement votre chemin, laissant bientôt la sombre forêt loin\n" +
                        "derrière vous. Le paysage est plus riant maintenant mais, au bout d'un moment, la\n" +
                        "route descend et plonge dans une vallée. Vous continuez à avancer et vous vous trou-\n" +
                        "vez bientôt environné d'une brume qui ne cesse de s'épaissir. Cette brume se\n" +
                        "transforme bien vite en brouillard. Et vous ne voyez même plus le bout de votre nez.\n" +
                        "Votre sens de l'orientation, si aigu d'habitude, s'amenuise, diminue, disparaît\n" +
                        "complètement, saprelotte, Pip, vous voilà perdu ! Il ne vous reste plus qu'une solution :\n" +
                        "lancer deux dés pour décider dans quelle direction poursuivre.\n" +
                        "si vous faites : de 2 à 4 : rendez-vous au 5.\n" +
                        "de 5 à 7 : rendez-vous au 8.\n" +
                        "de 8 à 12 : rendez-vous au 64.\n");

        chapter16.addChoice(new Choice("Page 5", "5"));
        chapter16.addChoice(new Choice("Page 8", "8"));
        chapter16.addChoice(new Choice("Page 64", "64"));

        Chapter chapter17 = new Chapter("17", "",
                "17\n" +
                        "Désolé, mais vous semblez toujours complètement perdu. Lancez les dés de nouveau.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 73.\n" +
                        "de 7 à 12 : rendez-vous au 82.\n");

        chapter17.addChoice(new Choice("Page 73", "73"));
        chapter17.addChoice(new Choice("Page 82", "82"));

        Chapter chapter18 = new Chapter("18", "",
                "18\n" +
                        "eh bien, voilà ! Vous rassemblez votre matériel et vous reculez le long du sentier pour\n" +
                        "prendre le plus d' élan possible. Vous faites une profonde aspiration, vous touchez du\n" +
                        "bois, (ce n'est pas ça qui manque dans la forêt) et vous foncez à toute allure vers le\n" +
                        "gouffre. Lancez deux dés pour savoir si vous atterrissez sain et sauf de l'autre côté. (Et\n" +
                        "bonne chance).\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 14.\n" +
                        "de 7 à 12 : rendez-vous au 85.\n");

        chapter18.addChoice(new Choice("Page 14", "14"));
        chapter18.addChoice(new Choice("Page 85", "85"));

        Chapter chapter19 = new Chapter("19", "",
                "19\n" +
                        "Quelqu'un avance dans votre direction le long de la route. Une créature gigantesque.\n" +
                        "Elle a une curieuse démarche en outre, se balançant d'un côté sur l'autre comme si elle\n" +
                        "éprouvait quelque difficulté à garder son équilibre. Elle doit peser une tonne : le sol\n" +
                        "tremble sous ses pas. Et elle est d'une étrange couleur : une sorte de gris ardoise. Tout\n" +
                        "cela ne présage rien de bon Pip ! Elle marche droit sur vous. Nom d'un petit\n" +
                        "bonhomme ce n'est pas un homme du tout. C'est... c'est... c'est une statue ! Une statue\n" +
                        "qui marche ! Un Homme de Pierre ! Et qui tient une épée de pierre !\n" +
                        "— Dites donc, un instant ! lancez-vous en voyant l'Homme de Pierre arriver\n" +
                        "pesamment sur vous. Mais c'est peine perdue. Déjà il brandit son épée. Il va falloir\n" +
                        "combattre, Pip. Vous ne pouvez l'éviter, quel que soit votre amour de la paix. Il faut\n" +
                        "tuer, ou être tué ici même. Mais vos armes seront-elles efficaces contre un Homme de\n" +
                        "Pierre? Il n'y a qu'une façon de le savoir.\n" +
                        "Allez-vous essayer de combattre avec des armes ? Rendez-vous au 15.\n" +
                        "Décidez-vous d'utiliser la magie ? Rendez-vous au 12.\n" +
                        "Si vous préférez vous servir d'une arme magique (E.J. par exemple), rendez-vous au\n" +
                        "32.\n");

        chapter19.addChoice(new Choice("Page 15", "15"));
        chapter19.addChoice(new Choice("Page 12", "12"));
        chapter19.addChoice(new Choice("Page 32", "32"));

        Chapter chapter20 = new Chapter("20", "",
                "20\n" +
                        "Pouah, quelle puanteur ! A en juger par l'odeur vous devez vous trouver dans des\n" +
                        "écuries. Mais elles ne semblent pas avoir servi récemment. Les stalles sont\n" +
                        "démantelées, la paille est pourrie, et de vieux harnais de cuir accrochés à des clous\n" +
                        "fixés aux murs semblent en si piteux état qu'ils se rompraient à coup sûr si vous\n" +
                        "vouliez les passer à un cheval. Heureusement, ce ne sera pas nécessaire puisqu'il n'y a\n" +
                        "pas de chevaux par ici. Si vous désirez fouiller ces écuries, rendez-vous au 71.\n" +
                        "Sinon, vous reprenez votre carte, et vous choisissez un autre numéro.\n");

        chapter20.addChoice(new Choice("Page 71", "71"));
        chapter20.addChoice(new Choice("Carte", "10"));

        Chapter chapter21 = new Chapter("21", "",
                "21\n" +
                        "Vous suivez le chemin, bordé de part et d'autre par la forêt, en direction du nord-est.\n" +
                        "Les arbres sont toujours aussi serrés, aussi sombres et menaçants mais, du moins, le\n" +
                        "sentier devant vous semble dégagé et libre de tout obstacle. Jusqu'au moment en fait,\n" +
                        "où vous arrivez au bord d'un gouffre Mmmm... Vous vous en approchez. A vos pieds\n" +
                        "s'ouvre un à-pic de près de soixante mètres. Tout au fond coule une rivière turbulante,\n" +
                        "rapide. Levant les yeux, vous constatez que le sentier reprend de l'autre côté-de\n" +
                        "l'abîme, dont vous estimez la largeur à environ cinq ou six mètres. Si vous prenez\n" +
                        "suffisamment d'élan, peut-être pourriez-vous le franchir d'un bond. Mais, par ailleurs,\n" +
                        "vous êtes fatigué et lourdement chargé. Vérifions de quel matériel vous disposez.\n" +
                        "Si vous possédez dans votre équipement une corde, des crampons d'escalade ou une\n" +
                        "hache (ou une hache d'armes), rendez-vous au 7. si vous voulez tenter de sauter,\n" +
                        "rendez-vous au 18. Si vous pensez pouvoir trouver un moyen de traverser en pénétrant\n" +
                        "de nouveau dans la forêt, rendez- vous au 5.\n");

        chapter21.addChoice(new Choice("Page 7", "7"));
        chapter21.addChoice(new Choice("Page 18", "18"));
        chapter21.addChoice(new Choice("Page 5", "5"));

        Chapter chapter22 = new Chapter("22", "",
                "22\n" +
                        "—Vous pensez bien que je comprends ça parfaitement. dit le petit homme, nullement\n" +
                        "offensé. Restez tranquillement où vous êtes, et mangez tout à votre aise. Je me\n" +
                        "contenterai de vous tenir compagnie un moment.\n" +
                        "tandis que vous terminez votre repas, l'idée vous vint que le petit homme pourrait\n" +
                        "peut-être vous eclairer sur le mystère qui entoure le village. Aussi, lui demandez-vous\n" +
                        "comment vous y rendre.\n" +
                        "—Ce patelin, là-bas? demande-t-il. Je le connais comme ma poche. J'y suis allé\n" +
                        "souvent et j'y ai rencontré des gens parmi les plus aimables, les plus serviables, les\n" +
                        "plus généreux de tout Avalon. Il s'appelle : la Pierre-qui-Mue.\n" +
                        "— Voilà des heures que j'avance dans sa direction, et je n'ai pas l'impression de m'en\n" +
                        "approcher.\n" +
                        "—Oui, c'est un endroit très difficile à atteindre, acquiesce-t-il. Mais si vous voulez\n" +
                        "mon avis, dirigez- vous donc vers le 29.\n" +
                        "Vous pouvez suivre son conseil. Rendez-vous alors au 29.\n" +
                        "Mais vous pouvez préférer ne pas en tenir compte, et poursuivre votre chemin. Dans\n" +
                        "ce cas, rendez- vous au 19.\n");

        chapter22.addChoice(new Choice("Page 29", "29"));
        chapter22.addChoice(new Choice("Page 19", "19"));

        Chapter chapter23 = new Chapter("23", "",
                "23\n" +
                        "l'Homme de Pierre possède 28 POINTS DE VIE. Il n'est pas très agile, et il lui faut donc\n" +
                        "obtenir au minimum 8, avec les dés, pour vous frapper de son épée. En revanche,\n" +
                        "cette épée vous infligera 4 Points de Dommage si elle vous touche. Bonne chance !\n" +
                        "Si l'Homme de Pierre vous tue, rendez-vous au 14. Mais si vous êtes vainqueur,\n" +
                        "rendez-vous au 37.\n");

        chapter23.addChoice(new Choice("Page 14", "14"));
        chapter23.addChoice(new Choice("Page 37", "37"));

        Chapter chapter24 = new Chapter("24", "",
                "24\n" +
                        "Cette église ne ressemble à aucune de celles qu'il vous ait été donné de voir. Du\n" +
                        "moins, dans l'état où - elle se trouve. Il y a une nef, des bancs, un autel, un orgue, une\n" +
                        "chaire, un lutrin et tout le reste, y compris des vitraux. Mais tout cela est couvert de\n" +
                        "poussière, et il y a des toiles d'araignées partout. Elles vous effleurent le visage quand\n" +
                        "vous avancez, et un nuage de poussière se soulève à chacun de vos pas. Les habitants\n" +
                        "n'ont guère l'air portés sur la religion. Vous avancez, et... ta-ta-ta-boum ! Une musique\n" +
                        "d'orgue ! L'orgue de l'église s'est mis à jouer. Vous sursautez, vous pivotez sur vous-\n" +
                        "même en levant les yeux vers la tribune d'orgue, mais les toiles d'araignées vous\n" +
                        "empêchent de voir. Ah ha ha ha ha ah !\n" +
                        "Un rire dément ! Son écho se répercute dans toute l'église puis la musique\n" +
                        "s'interrompt brusquement. D'instinct, vous portez la main à la garde de votre épée, et\n" +
                        "c'est une chance, car une silhouette voilée et masquée, brandissant une lame\n" +
                        "étincelante, se balance au-dessus de vous au bout d'une corde. — Prends garde !\n" +
                        "hurle la créature en atterrissant à quelques mètres devant vous. Prends garde au Fan-\n" +
                        "tôme de l'Église du Village ! Là-dessus, il bondit sur vous et vous attaque\n" +
                        "férocement, l'épée haute. Pas de doute, il faut vous battre, Pip, quoi que vous en\n" +
                        "pensiez. Le Fantôme possède 30 POINTS DE VIE mais ne porte pas d'armure, vous\n" +
                        "lui infligerez donc le maximum de Points de Dommage chaque fois que vous le\n" +
                        "frapperez. En revanche, il est de première force à l'épée, il lui suffit donc de sortir un\n" +
                        "5 ou plus pour vous frapper. Son épée inflige 3 Points de Dommage.\n" +
                        "si le Fantôme vous tue, rendez-vous au 14. si VOUS tuez le Fantôme, rendez-vous 87.\n");

        chapter24.addChoice(new Choice("Page 14", "14"));
        chapter24.addChoice(new Choice("Page 87", "87"));

        Chapter chapter25 = new Chapter("25", "",
                "25\n" +
                        "vous émergez dans un désert volcanique. Vous vous trouvez au milieu de champs de\n" +
                        "lave, de vastes étendues où se dressent en formes grotesques des pierres au profil\n" +
                        "tourmenté, une surface ondulée, creusée de trous, sur laquelle il est difficile d'avancer.\n" +
                        "Vous êtes entouré de falaises aux flancs abrupts se dressant à des hauteurs\n" +
                        "vertigineuses. Espérons que vous n'aurez pas à les escalader : même avec l'équipement\n" +
                        "dont vous disposez, il vous faudrait près d'une année. L'atmosphère est sinistre ; les\n" +
                        "falaises sont si hautes qu'elles arrêtent presque toute la lumière du soleil. Il devrait\n" +
                        "faire froid également, mais en réalité, il règne une chaleur presque tropicale, due sans\n" +
                        "doute à quelque activité volcanique souterraine. En tout cas une odeur acide,\n" +
                        "pénétrante, sulfureuse, flotte dans ce décor, comme si vous étiez arrivé au seuil même\n" +
                        "de l'Enfer. Vous avancez avec circonspection, l'oreille aux aguets. Le sol est en\n" +
                        "général relativement ferme, bien qu'il s'effondre un peu par endroits. De temps à autre,\n" +
                        "un grondement lointain, presque inaudible, roule sous vos pieds, vous mettant les nerfs\n" +
                        "encore plus à vif. Vous n'avez le choix qu'entre deux directions : plein nord, ou nord-\n" +
                        "est. Toutes les autres vous sont barrées par des falaises, ou des flèches rocheuses aux\n" +
                        "lignes chaotiques et torturées.\n" +
                        "Si vous décidez de prendre la direction du nord, rendez-vous au 62.\n" +
                        "Si vous préférez partir en direction du nord-est rendez-vous au 84.\n");

        chapter25.addChoice(new Choice("Page 62", "62"));
        chapter25.addChoice(new Choice("Page 84", "84"));

        Chapter chapter26 = new Chapter("26", "",
                "26\n" +
                        "Vous venez d'être empoisonné. Ce petit monstre féroce avait des crocs venimeux.\n" +
                        "Quel désastre Lancez vite deux dés.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 4 : rendez-vous au redoutable 14.\n" +
                        "de 5 à 8 : vous êtes naturellement immunisé contre le poison. Revenez au 6, et\n" +
                        "poursuivez le combat.\n" +
                        "9 : le Lapin Blanc meurt d'une allergie brutale pour vous avoir trop mordu. Rendez-\n" +
                        "vous au 6, et voyez ce que vous devez faire, maintenant que vous êtes débarrassé de\n" +
                        "ce maudit rongeur.\n" +
                        "de 10 à 12 : vous avez perdu la moitié de vos POINTS DE VIE, et la faiblesse qui\n" +
                        "vous gagne vous fait perdre connaissance. Lorsque vous revenez à vous, vous\n" +
                        "constatez que le Lapin Blanc a réussi (et vous vous demandez bien comment) à vous\n" +
                        "traîner jusque dans les bois, où il a dû disparaître. Rendez-vous au 5.\n");

        chapter26.addChoice(new Choice("Page 14", "14"));
        chapter26.addChoice(new Choice("Page 6", "6"));
        chapter26.addChoice(new Choice("Page 5", "5"));

        Chapter chapter27 = new Chapter("27", "",
                "27\n" +
                        "Allez-vous réussir cette descente vertigineuse? La falaise est extrêmement abrupte.\n" +
                        "Et même avec des cordes et des crampons, il faut être un pet inconscient pour s'y\n" +
                        "aventurer. Si vous hésitez, VOUS pouvez retourner immédiatement au 7 pour réfléchir\n" +
                        "de nouveau aux choix qui s'offrent à vous. Mais si vous décidez de tenter l'aventure,\n" +
                        "lancez deux dés.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 8 : rendez-vous au 49.\n" +
                        "de 9 à 12 : rendez-vous au 59.\n");

        chapter27.addChoice(new Choice("Page 49", "49"));
        chapter27.addChoice(new Choice("Page 59", "59"));

        Chapter chapter28 = new Chapter("28", "",
                "28\n" +
                        "Des poireaux et des laitues en pierre, des choux en pierre, des petits pois en pierre, des\n" +
                        "carottes en pierre, des épinards en pierre, et même des pommes de terre en pierre. Et\n" +
                        "un peu plus loin, vous voyez nettement des fleurs en pierre : des roses, des jacinthes,\n" +
                        "des rhododendrons, du muguet, des boutons d'or et des marguerites. Il doit y avoir une\n" +
                        "belle quantité de chaux dans le sol par ici. Et les statues de monstres n'ont rien de bien\n" +
                        "plaisant. Ce sont de gigantesques créatures aux gueules hérissées de crocs, aux\n" +
                        "poitrines velues, aux pattes griffues. Absolument hideuses à voir. Et qui ont l'air\n" +
                        "vivantes. On s'attend presque d'un instant à l'autre à en voir une remuer. D'ailleurs, il y\n" +
                        "en a une, là-bas, dans le coin, qui semble bouger effectivement. Un effet de la lumière\n" +
                        "sans doute. Le sol n'est pas en pierre. C'est de la terre ordinaire, comme dans un vrai\n" +
                        "jardin. Sauf qu'il y pousse des plantes en pierre. Quel endroit bizarre. Pourquoi\n" +
                        "quelqu'un aurait-il envie de faire pousser des végétaux en pierre et de décorer ensuite\n" +
                        "tout son jardin de statues de monstres? Etes-vous bien sûr que celui-ci n'a pas bougé ?\n" +
                        "Non, il ne peut pas avoir bougé. Vous tirez, à titre d'expérience, sur un chou-fleur en\n" +
                        "pierre, et il s'arrache du sol, racines comprises. Des racines en pierre, bien entendu.\n" +
                        "Plus que bizarre, cet endroit. Avez-vous remarqué comme il fait froid soudain ?\n" +
                        "Le Monstre a bel et bien bougé ! Il se tourne vers vous, bombant sa poitrine velue,\n" +
                        "montrant les crocs ! Rapide comme l'éclair, vous portez la main à votre épée... mais\n" +
                        "voilà que votre bras vous refuse tout service ! Fuyez, Pip, fuyez ! Vos jambes elles\n" +
                        "aussi sont paralysées. Vous avez froid. Tellement froid ! Vous ne pouvez bouger un\n" +
                        "seul muscle et vous êtes glacé ! Désespérément, vous essayez de prononcer un\n" +
                        "sortilège, mais vos lèvres et votre langue elles-mêmes vous refusent tout service. Vous\n" +
                        "êtes en train de vous transformer en statue de pierre, voilà ce qui vous arrive. Aucun\n" +
                        "doute n'est permis ! Le Monstre n'est plus qu'à quelques mètres de vous. Il ouvre une\n" +
                        "large gueule hérissée de crocs. Au moins, vous pouvez encore lancer les dés. lancez-en\n" +
                        "deux maintenant pour voir si vous pouvez vous sortir de ce guêpier.\n" +
                        "si vous obtenez :\n" +
                        "de 2 à 6 : rendez-vous au 67.\n" +
                        "de 7 à 10 : rendez-vous au 70.\n" +
                        "11 ou 12 : rendez-vous au 75.\n");

        chapter28.addChoice(new Choice("Page 67", "67"));
        chapter28.addChoice(new Choice("Page 70", "70"));
        chapter28.addChoice(new Choice("Page 75", "75"));

        Chapter chapter29 = new Chapter("29", "",
                "29\n" +
                        "C'est absolument impensable, Pip, et pourtant, c'est bien ce qui est arrivé. Vous avez\n" +
                        "suivi ses directives à la lettre... et maintenant vous vous retrouvez à votre point de\n" +
                        "départ, avec Wanda la Vagabonde qui vous regarde avec stupeur. Pas d'autre solution\n" +
                        "que de sortir votre carte et de repartir à zéro. Mais une partie de l'itinéraire au moins\n" +
                        "vous est maintenant familier, et vous avez peut-être appris à éviter certains des pires\n" +
                        "dangers.\n");

        chapter29.addChoice(new Choice("Carte", "10"));

        Chapter chapter30 = new Chapter("30", "",
                "30\n" +
                        "On dirait les vestiges d'une tour de guet en pierre. Très, très ancienne. En ruine\n" +
                        "maintenant, bien entendu. La presque totalité de la tour s'est écroulée et le sol est\n" +
                        "jonché de pierres et de gravats. Vous pourriez perdre votre temps ici indéfiniment,\n" +
                        "vous tordant les chevilles sur les cailloux. Pourquoi ne pas lancer deux dés pour voir\n" +
                        "ce que le sort réserve à un intrépide aventurier dans cet endroit.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 80.\n" +
                        "de 7 à 12 : rendez-vous au 88.\n");

        chapter30.addChoice(new Choice("Page 80", "80"));
        chapter30.addChoice(new Choice("Page 88", "88"));

        Chapter chapter31 = new Chapter("31", "",
                "31\n" +
                        "rien à faire, encore perdu. Lancez les dés de nouveau\n" +
                        "SI VOUS faites :\n" +
                        "de 2 à 6 : rendez-vous au 17.\n" +
                        "de 7 à 12 : rendez-vous au 73.\n");

        chapter31.addChoice(new Choice("Page 17", "17"));
        chapter31.addChoice(new Choice("Page 73", "73"));

        Chapter chapter32 = new Chapter("32", "",
                "32\n" +
                        "Pas un mauvais choix, Pip. Les armes magiques sont efficaces ici, bien que vous\n" +
                        "ayez à soustraire 4 points de tous les Points de Dommage qu'elles infligent. rendez-\n" +
                        "vous au 23.\n");

        chapter32.addChoice(new Choice("Page 23", "23"));

        Chapter chapter33 = new Chapter("33", "",
                "33\n" +
                        "le village disparaît et la route s'étend à l'infini devant vous. Vous faites demi-tour,\n" +
                        "mais le porche a disparu lui aussi. Il n'est plus question de revenir sur vos pas\n" +
                        "maintenant. La seule solution, c'est de continuer votre chemin. Vous marchez jusqu'à\n" +
                        "ce que vos jambes s'alourdissent de fatigue, et que le soleil se couche, et vous installez\n" +
                        "votre campement comme vous le pouvez : demain, il fera jour. Naturellement, il pleut\n" +
                        "! Rendez-vous au 125.\n");

        chapter33.addChoice(new Choice("Page 125", "125"));

        Chapter chapter34 = new Chapter("34", "",
                "34\n" +
                        "Comment un être sensé pourrait-il avoir envie d\"explorer cet endroit? C'est un\n" +
                        "cimetière. Vous le saviez que c'était un cimetière : vous pouviez parfaitement le voir\n" +
                        "avant de décider d'entrer ! Que pouviez-vous bien espérer trouver dans un cimetierre ?\n" +
                        "Eh bien, vous avez trouvé des tombes. Et des pierres tombales. Et... oh, misère, on\n" +
                        "dirait que vous avez recommencé, Pip : cette tombe, un peu plus loin, est béante !\n" +
                        "Vous voyez une main en sortir et gratter la terre meuble à côté de la fosse ! Précipitez-\n" +
                        "vous au 91, avant que la Chose ne bondisse sur vous !\n");

        chapter34.addChoice(new Choice("Page 91", "91"));

        Chapter chapter35 = new Chapter("35", "",
                "35\n" +
                        "Lancez deux dés. Si vous faites :\n" +
                        "de 2 à 6 : vous ne voyez aucun arbre qui pourrai: faire l'affaire à proximité. Rendez-\n" +
                        "vous au 21, et faites un nouveau choix, de 7 à 12 : rendez-vous au 85.\n");

        chapter35.addChoice(new Choice("Page 21", "21"));
        chapter35.addChoice(new Choice("Page 85", "85"));

        Chapter chapter36 = new Chapter("36", "",
                "36\n" +
                        "— Très aimable à vous, Votre Honneur, dit le petit homme. Ce sera bien volontiers,\n" +
                        "puisque vous me le proposez. Et il se hisse sur la souche pour s'installer\n" +
                        "confortablement. Pendant qu'il mange (et il a un fameux coup de fourchette pour\n" +
                        "quelqu'un de sa taille), il vous examine, vous, vos vêtements et vos armes. Ai-je raison\n" +
                        "de supposer, finit-il par demander, que vous êtes un voyageur ou un aventurier ? Vous\n" +
                        "acquiescez d'un signe de tête.\n" +
                        "— C'est bien ce que je pensais, en vous regardant. Vous ne vous rendez pas, par\n" +
                        "hasard, à l'Antre du Dragon ?\n" +
                        "Allez-vous lui révéler votre destination ? Si oui. rendez-vous au 56.\n" +
                        "Mais peut-être jugez-vous plus prudent de ne rien lui dire ? Rendez-vous dans ce cas\n" +
                        "au 22.\n");

        chapter36.addChoice(new Choice("Page 56", "56"));
        chapter36.addChoice(new Choice("Page 22", "22"));

        Chapter chapter37 = new Chapter("37", "",
                "37\n" +
                        "Ouille, ouille, ouille ! Quel combat ! Pendant un moment, vous avez bien cru que vous\n" +
                        "n'alliez pas vous en tirer. Cela montre ce qu'on peut accomplir grâce au courage, à\n" +
                        "l'habileté et à la détermination. vous vous attardez un moment pour reprendre des\n" +
                        "forces, puis vous poursuivez votre chemin. Rendez- vous au 13.\n");

        chapter37.addChoice(new Choice("Page 13", "13"));

        Chapter chapter38 = new Chapter("38", "",
                "38\n" +
                        "on dirait une chaumière, ressemblant à n'importe quelle chaumière. Murs blanchis à\n" +
                        "la chaux, toit de chaume. Elle est construite contre la palissade, bien sûr. de même\n" +
                        "que plusieurs autres comme vous l'avez remarqué, sans aucun doute. Vous entrez\n" +
                        "néanmoins, puisque vous êtes venu jusque-là. Et la porte étant entrebâillée, vous y\n" +
                        "pénétrez sans probleme.\n" +
                        "la chaumière est déserte. Assez propre, et en ordre, mais il y règne cette étrange odeur\n" +
                        "de moisi indiquant que personne n'a vécu ici depuis des années. la maison semble\n" +
                        "avoir été habitée autrefois. Il y a encore quelques meubles çà et là, des bibelots sur la\n" +
                        "tablette de la cheminée et des tableaux (des paysages) aux murs. Et il y a une porte de\n" +
                        "derrière ! S'il y a une porte de derrière, cela signifie qu'on doit pouvoir franchir la\n" +
                        "palissade !\n" +
                        "Si vous voulez franchir cette porte, rendez-vous au 92.\n" +
                        "Si vous préférez vous attarder encore un moment dans le village, reprenez votre carte\n" +
                        "et allez explorer un autre endroit.\n");

        chapter38.addChoice(new Choice("Page 92", "92"));
        chapter38.addChoice(new Choice("Carte", "10"));

        Chapter chapter39 = new Chapter("39", "",
                "39\n" +
                        "Comme vous vous approchez de cette chaumière, vous remarquez, près de la porte\n" +
                        "d'entrée, l'un de ces atroces gnomes en plastique dont on décore les jardins et qui vont\n" +
                        "devenir si populaires dans quelques siècles. Hé, un instant ! Un nain en plastique du\n" +
                        "temps du roi Arthur ! Il y a là quelque chose qui cloche !\n" +
                        "— Bonjour, l'Humain, dit le Gnome que vous contemplez alors avec stupéfaction.\n" +
                        "— Vous êtes... réel ? demandez-vous bêtement.\n" +
                        "— Je pense, répond le Gnome. Que puis-je faire pour vous ?\n" +
                        "Excellente question, puisque vous comptiez simplement fouiner un peu dans sa\n" +
                        "chaumière, ce que vous ne pouvez guère lui avouer. Après réflexion, vous repondez :\n" +
                        "— Je me demande, Gnoble Gnome, si vous connaissez le meilleur chemin pour\n" +
                        "arriver à l'Antre du Dragon ? Ou, par ailleurs, si vous pouvez m'indiquer un moyen de\n" +
                        "sortir de ce village.\n" +
                        "Il opine gravement de sa tête de Gnome.\n" +
                        "—Parmi toutes les questions que vous auriez pu poser, je peux vous proposer des\n" +
                        "réponses à ces deux-là. Avez-vous de quoi les payer ?\n" +
                        "—Payer quoi ? demandez-vous.\n" +
                        "—Les réponses ! rugit le Gnome, furieux. Vous ne pensez quand même pas que je vais\n" +
                        "vous donner gratis des renseignements de cette valeur ?\n" +
                        "— Non, bien sûr, mentez-vous effrontément. Combien coûtent les réponses ?\n" +
                        "—Ça dépend, dit-il un peu calmé. Je suis, comprenez-vous, un Gnome à l'esprit\n" +
                        "aventureux, et donc tout à fait prêt à laisser le hasard décider du prix. Là-dessus, il sort\n" +
                        "de sa poche deux dés tout à fait semblables aux vôtres.\n" +
                        "— Voulez-vous prendre la peine de les examiner? dit-il. Pour vous assurer qu'ils ne\n" +
                        "sont pas pipés ou trafiqués d'une façon quelconque ?\n" +
                        "Vous les examinez donc. On a beau être transporté à\n" +
                        "— l'ère de la Chevalerie, l'esprit chevaleresque ne vous oblige pas à vous laisser\n" +
                        "arnaquer par un Gnome. Les dés, cependant, sont parfaitement normaux.\n" +
                        "Voyons, reprend le Gnome', vous désirez connaître le chemin jusqu'à l'Antre du\n" +
                        "Dragon. Disons que c'est la Question n° 1. Et vous voulez savoir comment on sort du\n" +
                        "village. Ce sera la Question n° 2. Maintenant nous allons jeter ces dés parfaitement\n" +
                        "normaux et découvrir combien vaut chaque question, en Pièces d'Or. Pour chaque\n" +
                        "point sorti par les dés, la valeur sera de 10 Pièces d'Or. Vous pouvez donc,\n" +
                        "éventuellement obtenir les réponses à vos questions pour 20 Pièces, mais il se peut que\n" +
                        "vous ayez à débourser jusqu'à 120 Pièces d'Or. Inscrivez ci-dessous les chiffres que\n" +
                        "vous obtenez en lançant les dés, et multipliez-les par 10.\n" +
                        "Question n° 1 : Question n° 2 :\n" +
                        "Avez-vous les moyens de payer pour obtenir des réponses à vos questions ? Vérifiez\n" +
                        "l'argent et les objets de valeur dont vous disposez. Si vous ne voulez pas payer, que\n" +
                        "vous en ayez les moyens ou non, reprenez votre carte et allez explorer un autre endroit\n" +
                        "(le Gnome n'y verra aucun inconvénient, et vous pourrez toujours revenir le voir plus\n" +
                        "tard, si vous le désirez). Si vous payez pour une réponse à la Question n° 1. rendez-\n" +
                        "vous au 93.\n" +
                        "Si vous payez pour une réponse à la Question n° 2, rendez-vous au 113.\n" +
                        "Si vous payez pour les deux réponses, vous pouvez choisir de vous rendre soit au 93,\n" +
                        "soit au 113\n");

        chapter39.addChoice(new Choice("Page 93", "93"));
        chapter39.addChoice(new Choice("Page 113", "113"));

        Chapter chapter40 = new Chapter("40", "",
                "40\n" +
                        "Voilà qui est mieux ! Une table chargée de beignets, de meringues, de tartes aux\n" +
                        "pommes, de cakes, de brioches, de bombes glacées, de gâteaux aux noix et de\n" +
                        "friandises de toutes sortes. Il y a même un pichet de citronnade fraîche. Et personne en\n" +
                        "vue ! Régalez- vous. Vous avez besoin de prendre des forces quand vous le pouvez\n" +
                        "dans un endroit pareil ! Rendez-vous ensuite au 100.\n");

        chapter40.addChoice(new Choice("Page 100", "100"));

        Chapter chapter41 = new Chapter("41", "",
                "41\n" +
                        "dites-moi, Pip : qu'est-ce qui est vert vif avec des dents rouges, se tient debout sur\n" +
                        "deux jambes, et brandit une dague dans chaque main ? Non, je ne sais pas non plus.\n" +
                        "Mais il existe une créature ainsi forte dans cette chaumière. Elle possède en outre 5\n" +
                        "POINTS DE VIE, et vous considère d'un air affamé. je suppose que vous n'avez pas\n" +
                        "apporté de provisions de réserve, n'est-ce pas ? Si vous ne disposez que de peu de\n" +
                        "nourriture, mieux vaut ne pas en proposer, car vous vous retrouveriez à un moment ou\n" +
                        "à un autre, le ventre creux. Mais si vous avez un repas de réserve, la créature pourrait\n" +
                        "souffrir d'une telle indigestion, une fois rassasiée, qu'elle ne vous importunerait jamais\n" +
                        "plus. Si vous ne disposez pas de repas de réserve, vous devez, une fois de plus, livrer\n" +
                        "combat.\n" +
                        "si vous êtes vainqueur, vous pouvez garder les dagues, ainsi que les 10 Pièces d'Argent\n" +
                        "que vous trouverez dans la bourse de la créature (c'est peut etre bien une sorte de\n" +
                        "kangourou vert et rouge porteur de dagues... ou alors un ornithorynque magique... ou\n" +
                        "encore un très vieux nasique... A moins qu'il ne s'agisse d'un joueur de cricket\n" +
                        "australien bizarrement déguisé... On ne le saura jamais). Puis, reprenez la carte du\n" +
                        "village, et partez explorer un autre endroit. Si vous êtes vaincu... le 14 !\n");

        chapter41.addChoice(new Choice("Carte", "10"));
        chapter41.addChoice(new Choice("Page 14", "14"));

        Chapter chapter42 = new Chapter("42", "",
                "42\n" +
                        "Vous n'allez jamais le croire, Pip. Le soleil brille partout et Wanda la Vagabonde\n" +
                        "vous pousse dans le dos avec son mufle, l'air stupide. Vous avez bouclé la boucle et\n" +
                        "vous vous retrouvez à votre point de départ. Mieux vaut examiner à nouveau la carte\n" +
                        "que Merlin vous a donnée et refaire une tentative ! Vous pouvez choisir n'importe\n" +
                        "laquelle des sections indiquées pour reprendre le départ.\n");

        chapter42.addChoice(new Choice("Carte", "10"));

        Chapter chapter43 = new Chapter("43", "",
                "43\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter43.addChoice(new Choice("Page 35", "35"));
        chapter43.addChoice(new Choice("Page 27", "27"));

        Chapter chapter44 = new Chapter("44", "",
                "44\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter44.addChoice(new Choice("Page 35", "35"));
        chapter44.addChoice(new Choice("Page 27", "27"));

        Chapter chapter45 = new Chapter("45", "",
                "45\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter45.addChoice(new Choice("Page 35", "35"));
        chapter45.addChoice(new Choice("Page 27", "27"));

        Chapter chapter46 = new Chapter("46", "",
                "46\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter46.addChoice(new Choice("Page 35", "35"));
        chapter46.addChoice(new Choice("Page 27", "27"));

        Chapter chapter47 = new Chapter("47", "",
                "47\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter47.addChoice(new Choice("Page 35", "35"));
        chapter47.addChoice(new Choice("Page 27", "27"));

        Chapter chapter48 = new Chapter("48", "",
                "48\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter48.addChoice(new Choice("Page 35", "35"));
        chapter48.addChoice(new Choice("Page 27", "27"));

        Chapter chapter49 = new Chapter("49", "",
                "49\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter49.addChoice(new Choice("Page 35", "35"));
        chapter49.addChoice(new Choice("Page 27", "27"));

        Chapter chapter50 = new Chapter("50", "",
                "50\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter50.addChoice(new Choice("Page 35", "35"));
        chapter50.addChoice(new Choice("Page 27", "27"));

        Chapter chapter51 = new Chapter("51", "",
                "51\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter51.addChoice(new Choice("Page 35", "35"));
        chapter51.addChoice(new Choice("Page 27", "27"));

        Chapter chapter52 = new Chapter("52", "",
                "52\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter52.addChoice(new Choice("Page 35", "35"));
        chapter52.addChoice(new Choice("Page 27", "27"));

        Chapter chapter53 = new Chapter("53", "",
                "53\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter53.addChoice(new Choice("Page 35", "35"));
        chapter53.addChoice(new Choice("Page 27", "27"));

        Chapter chapter54 = new Chapter("54", "",
                "54\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter54.addChoice(new Choice("Page 35", "35"));
        chapter54.addChoice(new Choice("Page 27", "27"));

        Chapter chapter55 = new Chapter("55", "",
                "55\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter55.addChoice(new Choice("Page 35", "35"));
        chapter55.addChoice(new Choice("Page 27", "27"));

        Chapter chapter56 = new Chapter("56", "",
                "56\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter56.addChoice(new Choice("Page 35", "35"));
        chapter56.addChoice(new Choice("Page 27", "27"));

        Chapter chapter57 = new Chapter("57", "",
                "57\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter57.addChoice(new Choice("Page 35", "35"));
        chapter57.addChoice(new Choice("Page 27", "27"));

        Chapter chapter58 = new Chapter("58", "",
                "58\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter58.addChoice(new Choice("Page 35", "35"));
        chapter58.addChoice(new Choice("Page 27", "27"));

        Chapter chapter59 = new Chapter("59", "",
                "59\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter59.addChoice(new Choice("Page 35", "35"));
        chapter59.addChoice(new Choice("Page 27", "27"));

        Chapter chapter60 = new Chapter("60", "",
                "60\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter60.addChoice(new Choice("Page 35", "35"));
        chapter60.addChoice(new Choice("Page 27", "27"));

        Chapter chapter61 = new Chapter("61", "",
                "61\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter61.addChoice(new Choice("Page 35", "35"));
        chapter61.addChoice(new Choice("Page 27", "27"));

        Chapter chapter62 = new Chapter("62", "",
                "62\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter62.addChoice(new Choice("Page 35", "35"));
        chapter62.addChoice(new Choice("Page 27", "27"));

        Chapter chapter63 = new Chapter("63", "",
                "63\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter63.addChoice(new Choice("Page 35", "35"));
        chapter63.addChoice(new Choice("Page 27", "27"));

        Chapter chapter64 = new Chapter("64", "",
                "64\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter64.addChoice(new Choice("Page 35", "35"));
        chapter64.addChoice(new Choice("Page 27", "27"));

        Chapter chapter65 = new Chapter("65", "",
                "65\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter65.addChoice(new Choice("Page 35", "35"));
        chapter65.addChoice(new Choice("Page 27", "27"));

        Chapter chapter66 = new Chapter("66", "",
                "66\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter66.addChoice(new Choice("Page 35", "35"));
        chapter66.addChoice(new Choice("Page 27", "27"));

        Chapter chapter67 = new Chapter("67", "",
                "67\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter67.addChoice(new Choice("Page 35", "35"));
        chapter67.addChoice(new Choice("Page 27", "27"));

        Chapter chapter68 = new Chapter("68", "",
                "68\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter68.addChoice(new Choice("Page 35", "35"));
        chapter68.addChoice(new Choice("Page 27", "27"));

        Chapter chapter69 = new Chapter("69", "",
                "69\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter69.addChoice(new Choice("Page 35", "35"));
        chapter69.addChoice(new Choice("Page 27", "27"));

        Chapter chapter70 = new Chapter("70", "",
                "70\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter70.addChoice(new Choice("Page 35", "35"));
        chapter70.addChoice(new Choice("Page 27", "27"));

        Chapter chapter71 = new Chapter("71", "",
                "71\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter71.addChoice(new Choice("Page 35", "35"));
        chapter71.addChoice(new Choice("Page 27", "27"));

        Chapter chapter72 = new Chapter("72", "",
                "72\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter72.addChoice(new Choice("Page 35", "35"));
        chapter72.addChoice(new Choice("Page 27", "27"));

        Chapter chapter73 = new Chapter("73", "",
                "73\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter73.addChoice(new Choice("Page 35", "35"));
        chapter73.addChoice(new Choice("Page 27", "27"));

        Chapter chapter74 = new Chapter("74", "",
                "74\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter74.addChoice(new Choice("Page 35", "35"));
        chapter74.addChoice(new Choice("Page 27", "27"));

        Chapter chapter75 = new Chapter("75", "",
                "75\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter75.addChoice(new Choice("Page 35", "35"));
        chapter75.addChoice(new Choice("Page 27", "27"));

        Chapter chapter76 = new Chapter("76", "",
                "76\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter76.addChoice(new Choice("Page 35", "35"));
        chapter76.addChoice(new Choice("Page 27", "27"));

        Chapter chapter77 = new Chapter("77", "",
                "77\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter77.addChoice(new Choice("Page 35", "35"));
        chapter77.addChoice(new Choice("Page 27", "27"));

        Chapter chapter78 = new Chapter("78", "",
                "78\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter78.addChoice(new Choice("Page 35", "35"));
        chapter78.addChoice(new Choice("Page 27", "27"));

        Chapter chapter79 = new Chapter("79", "",
                "79\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter79.addChoice(new Choice("Page 35", "35"));
        chapter79.addChoice(new Choice("Page 27", "27"));

        Chapter chapter80 = new Chapter("80", "",
                "80\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter80.addChoice(new Choice("Page 35", "35"));
        chapter80.addChoice(new Choice("Page 27", "27"));

        Chapter chapter81 = new Chapter("81", "",
                "81\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter81.addChoice(new Choice("Page 35", "35"));
        chapter81.addChoice(new Choice("Page 27", "27"));

        Chapter chapter82 = new Chapter("82", "",
                "82\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter82.addChoice(new Choice("Page 35", "35"));
        chapter82.addChoice(new Choice("Page 27", "27"));

        Chapter chapter83 = new Chapter("83", "",
                "83\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter83.addChoice(new Choice("Page 35", "35"));
        chapter83.addChoice(new Choice("Page 27", "27"));

        Chapter chapter84 = new Chapter("84", "",
                "84\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter84.addChoice(new Choice("Page 35", "35"));
        chapter84.addChoice(new Choice("Page 27", "27"));

        Chapter chapter85 = new Chapter("85", "",
                "85\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter85.addChoice(new Choice("Page 35", "35"));
        chapter85.addChoice(new Choice("Page 27", "27"));

        Chapter chapter86 = new Chapter("86", "",
                "86\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter86.addChoice(new Choice("Page 35", "35"));
        chapter86.addChoice(new Choice("Page 27", "27"));

        Chapter chapter87 = new Chapter("87", "",
                "87\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter87.addChoice(new Choice("Page 35", "35"));
        chapter87.addChoice(new Choice("Page 27", "27"));

        Chapter chapter88 = new Chapter("88", "",
                "88\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter88.addChoice(new Choice("Page 35", "35"));
        chapter88.addChoice(new Choice("Page 27", "27"));

        Chapter chapter89 = new Chapter("89", "",
                "89\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter89.addChoice(new Choice("Page 35", "35"));
        chapter89.addChoice(new Choice("Page 27", "27"));

        Chapter chapter90 = new Chapter("90", "",
                "90\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter90.addChoice(new Choice("Page 35", "35"));
        chapter90.addChoice(new Choice("Page 27", "27"));

        Chapter chapter91 = new Chapter("91", "",
                "91\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter91.addChoice(new Choice("Page 35", "35"));
        chapter91.addChoice(new Choice("Page 27", "27"));

        Chapter chapter92 = new Chapter("92", "",
                "92\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter92.addChoice(new Choice("Page 35", "35"));
        chapter92.addChoice(new Choice("Page 27", "27"));

        Chapter chapter93 = new Chapter("93", "",
                "93\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter93.addChoice(new Choice("Page 35", "35"));
        chapter93.addChoice(new Choice("Page 27", "27"));

        Chapter chapter94 = new Chapter("94", "",
                "94\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter94.addChoice(new Choice("Page 35", "35"));
        chapter94.addChoice(new Choice("Page 27", "27"));

        Chapter chapter95 = new Chapter("95", "",
                "95\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter95.addChoice(new Choice("Page 35", "35"));
        chapter95.addChoice(new Choice("Page 27", "27"));

        Chapter chapter96 = new Chapter("96", "",
                "96\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter96.addChoice(new Choice("Page 35", "35"));
        chapter96.addChoice(new Choice("Page 27", "27"));

        Chapter chapter97 = new Chapter("97", "",
                "97\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter97.addChoice(new Choice("Page 35", "35"));
        chapter97.addChoice(new Choice("Page 27", "27"));

        Chapter chapter98 = new Chapter("98", "",
                "98\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter98.addChoice(new Choice("Page 35", "35"));
        chapter98.addChoice(new Choice("Page 27", "27"));

        Chapter chapter99 = new Chapter("99", "",
                "99\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter99.addChoice(new Choice("Page 35", "35"));
        chapter99.addChoice(new Choice("Page 27", "27"));

        Chapter chapter100 = new Chapter("100", "",
                "100\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter100.addChoice(new Choice("Page 35", "35"));
        chapter100.addChoice(new Choice("Page 27", "27"));

        Chapter chapter101 = new Chapter("101", "",
                "101\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter101.addChoice(new Choice("Page 35", "35"));
        chapter101.addChoice(new Choice("Page 27", "27"));

        Chapter chapter102 = new Chapter("102", "",
                "102\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter102.addChoice(new Choice("Page 35", "35"));
        chapter102.addChoice(new Choice("Page 27", "27"));

        Chapter chapter103 = new Chapter("103", "",
                "103\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter103.addChoice(new Choice("Page 35", "35"));
        chapter103.addChoice(new Choice("Page 27", "27"));

        Chapter chapter104 = new Chapter("104", "",
                "104\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter104.addChoice(new Choice("Page 35", "35"));
        chapter104.addChoice(new Choice("Page 27", "27"));

        Chapter chapter105 = new Chapter("105", "",
                "105\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter105.addChoice(new Choice("Page 35", "35"));
        chapter105.addChoice(new Choice("Page 27", "27"));

        Chapter chapter106 = new Chapter("106", "",
                "106\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter106.addChoice(new Choice("Page 35", "35"));
        chapter106.addChoice(new Choice("Page 27", "27"));

        Chapter chapter107 = new Chapter("107", "",
                "107\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter107.addChoice(new Choice("Page 35", "35"));
        chapter107.addChoice(new Choice("Page 27", "27"));

        Chapter chapter108 = new Chapter("108", "",
                "108\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter108.addChoice(new Choice("Page 35", "35"));
        chapter108.addChoice(new Choice("Page 27", "27"));

        Chapter chapter109 = new Chapter("109", "",
                "109\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter109.addChoice(new Choice("Page 35", "35"));
        chapter109.addChoice(new Choice("Page 27", "27"));

        Chapter chapter110 = new Chapter("110", "",
                "110\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter110.addChoice(new Choice("Page 35", "35"));
        chapter110.addChoice(new Choice("Page 27", "27"));

        Chapter chapter111 = new Chapter("111", "",
                "111\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter111.addChoice(new Choice("Page 35", "35"));
        chapter111.addChoice(new Choice("Page 27", "27"));

        Chapter chapter112 = new Chapter("112", "",
                "112\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter112.addChoice(new Choice("Page 35", "35"));
        chapter112.addChoice(new Choice("Page 27", "27"));

        Chapter chapter113 = new Chapter("113", "",
                "113\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter113.addChoice(new Choice("Page 35", "35"));
        chapter113.addChoice(new Choice("Page 27", "27"));

        Chapter chapter114 = new Chapter("114", "",
                "114\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter114.addChoice(new Choice("Page 35", "35"));
        chapter114.addChoice(new Choice("Page 27", "27"));

        Chapter chapter115 = new Chapter("115", "",
                "115\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter115.addChoice(new Choice("Page 35", "35"));
        chapter115.addChoice(new Choice("Page 27", "27"));

        Chapter chapter116 = new Chapter("116", "",
                "116\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter116.addChoice(new Choice("Page 35", "35"));
        chapter116.addChoice(new Choice("Page 27", "27"));

        Chapter chapter117 = new Chapter("117", "",
                "117\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter117.addChoice(new Choice("Page 35", "35"));
        chapter117.addChoice(new Choice("Page 27", "27"));

        Chapter chapter118 = new Chapter("118", "",
                "118\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter118.addChoice(new Choice("Page 35", "35"));
        chapter118.addChoice(new Choice("Page 27", "27"));

        Chapter chapter119 = new Chapter("119", "",
                "119\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter119.addChoice(new Choice("Page 35", "35"));
        chapter119.addChoice(new Choice("Page 27", "27"));

        Chapter chapter120 = new Chapter("120", "",
                "120\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter120.addChoice(new Choice("Page 35", "35"));
        chapter120.addChoice(new Choice("Page 27", "27"));

        Chapter chapter121 = new Chapter("121", "",
                "121\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter121.addChoice(new Choice("Page 35", "35"));
        chapter121.addChoice(new Choice("Page 27", "27"));

        Chapter chapter122 = new Chapter("122", "",
                "122\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter122.addChoice(new Choice("Page 35", "35"));
        chapter122.addChoice(new Choice("Page 27", "27"));

        Chapter chapter123 = new Chapter("123", "",
                "123\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter123.addChoice(new Choice("Page 35", "35"));
        chapter123.addChoice(new Choice("Page 27", "27"));

        Chapter chapter124 = new Chapter("124", "",
                "124\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter124.addChoice(new Choice("Page 35", "35"));
        chapter124.addChoice(new Choice("Page 27", "27"));

        Chapter chapter125 = new Chapter("125", "",
                "125\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter125.addChoice(new Choice("Page 35", "35"));
        chapter125.addChoice(new Choice("Page 27", "27"));

        Chapter chapter126 = new Chapter("126", "",
                "126\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter126.addChoice(new Choice("Page 35", "35"));
        chapter126.addChoice(new Choice("Page 27", "27"));

        Chapter chapter127 = new Chapter("127", "",
                "127\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter127.addChoice(new Choice("Page 35", "35"));
        chapter127.addChoice(new Choice("Page 27", "27"));

        Chapter chapter128 = new Chapter("128", "",
                "128\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter128.addChoice(new Choice("Page 35", "35"));
        chapter128.addChoice(new Choice("Page 27", "27"));

        Chapter chapter129 = new Chapter("129", "",
                "129\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter129.addChoice(new Choice("Page 35", "35"));
        chapter129.addChoice(new Choice("Page 27", "27"));

        Chapter chapter130 = new Chapter("130", "",
                "130\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter130.addChoice(new Choice("Page 35", "35"));
        chapter130.addChoice(new Choice("Page 27", "27"));

        Chapter chapter131 = new Chapter("131", "",
                "131\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter131.addChoice(new Choice("Page 35", "35"));
        chapter131.addChoice(new Choice("Page 27", "27"));

        Chapter chapter132 = new Chapter("132", "",
                "132\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter132.addChoice(new Choice("Page 35", "35"));
        chapter132.addChoice(new Choice("Page 27", "27"));

        Chapter chapter133 = new Chapter("133", "",
                "133\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter133.addChoice(new Choice("Page 35", "35"));
        chapter133.addChoice(new Choice("Page 27", "27"));

        Chapter chapter134 = new Chapter("134", "",
                "134\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter134.addChoice(new Choice("Page 35", "35"));
        chapter134.addChoice(new Choice("Page 27", "27"));

        Chapter chapter135 = new Chapter("135", "",
                "135\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter135.addChoice(new Choice("Page 35", "35"));
        chapter135.addChoice(new Choice("Page 27", "27"));

        Chapter chapter136 = new Chapter("136", "",
                "136\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter136.addChoice(new Choice("Page 35", "35"));
        chapter136.addChoice(new Choice("Page 27", "27"));

        Chapter chapter137 = new Chapter("137", "",
                "137\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter137.addChoice(new Choice("Page 35", "35"));
        chapter137.addChoice(new Choice("Page 27", "27"));

        Chapter chapter138 = new Chapter("138", "",
                "138\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter138.addChoice(new Choice("Page 35", "35"));
        chapter138.addChoice(new Choice("Page 27", "27"));

        Chapter chapter139 = new Chapter("139", "",
                "139\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter139.addChoice(new Choice("Page 35", "35"));
        chapter139.addChoice(new Choice("Page 27", "27"));

        Chapter chapter140 = new Chapter("140", "",
                "140\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter140.addChoice(new Choice("Page 35", "35"));
        chapter140.addChoice(new Choice("Page 27", "27"));

        Chapter chapter141 = new Chapter("141", "",
                "141\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter141.addChoice(new Choice("Page 35", "35"));
        chapter141.addChoice(new Choice("Page 27", "27"));

        Chapter chapter142 = new Chapter("142", "",
                "142\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter142.addChoice(new Choice("Page 35", "35"));
        chapter142.addChoice(new Choice("Page 27", "27"));

        Chapter chapter143 = new Chapter("143", "",
                "143\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter143.addChoice(new Choice("Page 35", "35"));
        chapter143.addChoice(new Choice("Page 27", "27"));

        Chapter chapter144 = new Chapter("144", "",
                "144\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter144.addChoice(new Choice("Page 35", "35"));
        chapter144.addChoice(new Choice("Page 27", "27"));

        Chapter chapter145 = new Chapter("145", "",
                "145\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter145.addChoice(new Choice("Page 35", "35"));
        chapter145.addChoice(new Choice("Page 27", "27"));

        Chapter chapter146 = new Chapter("146", "",
                "146\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter146.addChoice(new Choice("Page 35", "35"));
        chapter146.addChoice(new Choice("Page 27", "27"));

        Chapter chapter147 = new Chapter("147", "",
                "147\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter147.addChoice(new Choice("Page 35", "35"));
        chapter147.addChoice(new Choice("Page 27", "27"));

        Chapter chapter148 = new Chapter("148", "",
                "148\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter148.addChoice(new Choice("Page 35", "35"));
        chapter148.addChoice(new Choice("Page 27", "27"));

        Chapter chapter149 = new Chapter("149", "",
                "149\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter149.addChoice(new Choice("Page 35", "35"));
        chapter149.addChoice(new Choice("Page 27", "27"));

        Chapter chapter150 = new Chapter("150", "",
                "150\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter150.addChoice(new Choice("Page 35", "35"));
        chapter150.addChoice(new Choice("Page 27", "27"));

        Chapter chapter151 = new Chapter("151", "",
                "151\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter151.addChoice(new Choice("Page 35", "35"));
        chapter151.addChoice(new Choice("Page 27", "27"));

        Chapter chapter152 = new Chapter("152", "",
                "152\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter152.addChoice(new Choice("Page 35", "35"));
        chapter152.addChoice(new Choice("Page 27", "27"));

        Chapter chapter153 = new Chapter("153", "",
                "153\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter153.addChoice(new Choice("Page 35", "35"));
        chapter153.addChoice(new Choice("Page 27", "27"));

        Chapter chapter154 = new Chapter("154", "",
                "154\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter154.addChoice(new Choice("Page 35", "35"));
        chapter154.addChoice(new Choice("Page 27", "27"));

        Chapter chapter155 = new Chapter("155", "",
                "155\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter155.addChoice(new Choice("Page 35", "35"));
        chapter155.addChoice(new Choice("Page 27", "27"));

        Chapter chapter156 = new Chapter("156", "",
                "156\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter156.addChoice(new Choice("Page 35", "35"));
        chapter156.addChoice(new Choice("Page 27", "27"));

        Chapter chapter157 = new Chapter("157", "",
                "157\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter157.addChoice(new Choice("Page 35", "35"));
        chapter157.addChoice(new Choice("Page 27", "27"));

        Chapter chapter158 = new Chapter("158", "",
                "158\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter158.addChoice(new Choice("Page 35", "35"));
        chapter158.addChoice(new Choice("Page 27", "27"));

        Chapter chapter159 = new Chapter("159", "",
                "159\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter159.addChoice(new Choice("Page 35", "35"));
        chapter159.addChoice(new Choice("Page 27", "27"));

        Chapter chapter160 = new Chapter("160", "",
                "160\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter160.addChoice(new Choice("Page 35", "35"));
        chapter160.addChoice(new Choice("Page 27", "27"));

        Chapter chapter161 = new Chapter("161", "",
                "161\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter161.addChoice(new Choice("Page 35", "35"));
        chapter161.addChoice(new Choice("Page 27", "27"));

        Chapter chapter162 = new Chapter("162", "",
                "162\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter162.addChoice(new Choice("Page 35", "35"));
        chapter162.addChoice(new Choice("Page 27", "27"));

        Chapter chapter163 = new Chapter("163", "",
                "163\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter163.addChoice(new Choice("Page 35", "35"));
        chapter163.addChoice(new Choice("Page 27", "27"));

        Chapter chapter164 = new Chapter("164", "",
                "164\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter164.addChoice(new Choice("Page 35", "35"));
        chapter164.addChoice(new Choice("Page 27", "27"));

        Chapter chapter165 = new Chapter("165", "",
                "165\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter165.addChoice(new Choice("Page 35", "35"));
        chapter165.addChoice(new Choice("Page 27", "27"));

        Chapter chapter166 = new Chapter("166", "",
                "166\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter166.addChoice(new Choice("Page 35", "35"));
        chapter166.addChoice(new Choice("Page 27", "27"));

        Chapter chapter167 = new Chapter("167", "",
                "167\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter167.addChoice(new Choice("Page 35", "35"));
        chapter167.addChoice(new Choice("Page 27", "27"));

        Chapter chapter168 = new Chapter("168", "",
                "168\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter168.addChoice(new Choice("Page 35", "35"));
        chapter168.addChoice(new Choice("Page 27", "27"));

        Chapter chapter169 = new Chapter("169", "",
                "169\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter169.addChoice(new Choice("Page 35", "35"));
        chapter169.addChoice(new Choice("Page 27", "27"));

        Chapter chapter170 = new Chapter("170", "",
                "170\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter170.addChoice(new Choice("Page 35", "35"));
        chapter170.addChoice(new Choice("Page 27", "27"));

        Chapter chapter171 = new Chapter("171", "",
                "171\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter171.addChoice(new Choice("Page 35", "35"));
        chapter171.addChoice(new Choice("Page 27", "27"));

        Chapter chapter172 = new Chapter("172", "",
                "172\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter172.addChoice(new Choice("Page 35", "35"));
        chapter172.addChoice(new Choice("Page 27", "27"));

        Chapter chapter173 = new Chapter("173", "",
                "173\n" +
                        "Vous décidez d'utiliser votre hache pour abattre un arbre qui pourrait faire un pont\n" +
                        "convenable en travers du gouffre, rendez-vous au 35. si vous décidez de vous servir\n" +
                        "d'une corde ou de crampons pour descendre cette falaise verticale, rendez-vous au 27.\n");

        chapter173.addChoice(new Choice("Page 35", "35"));
        chapter173.addChoice(new Choice("Page 27", "27"));



        // Add chapters to scenario
        scenario.addChapter(chapter5);
        scenario.addChapter(chapter6);
        scenario.addChapter(chapter7);
        scenario.addChapter(chapter8);
        scenario.addChapter(chapter9);
        scenario.addChapter(chapter10);
        scenario.addChapter(chapter11);
        scenario.addChapter(chapter12);
        scenario.addChapter(chapter13);
        scenario.addChapter(chapter14);
        scenario.addChapter(chapter15);
        scenario.addChapter(chapter16);
        scenario.addChapter(chapter17);
        scenario.addChapter(chapter18);
        scenario.addChapter(chapter19);
        scenario.addChapter(chapter20);
        scenario.addChapter(chapter21);
        scenario.addChapter(chapter22);
        scenario.addChapter(chapter23);
        scenario.addChapter(chapter24);
        scenario.addChapter(chapter25);
        scenario.addChapter(chapter26);
        scenario.addChapter(chapter27);
        scenario.addChapter(chapter28);
        scenario.addChapter(chapter29);
        scenario.addChapter(chapter30);
        scenario.addChapter(chapter31);
        scenario.addChapter(chapter32);
        scenario.addChapter(chapter33);
        scenario.addChapter(chapter34);
        scenario.addChapter(chapter35);
        scenario.addChapter(chapter36);
        scenario.addChapter(chapter37);
        scenario.addChapter(chapter38);
        scenario.addChapter(chapter39);
        scenario.addChapter(chapter40);
        scenario.addChapter(chapter41);
        scenario.addChapter(chapter42);
        scenario.addChapter(chapter43);
        scenario.addChapter(chapter44);
        scenario.addChapter(chapter45);
        scenario.addChapter(chapter46);
        scenario.addChapter(chapter47);
        scenario.addChapter(chapter48);
        scenario.addChapter(chapter49);
        scenario.addChapter(chapter50);
        scenario.addChapter(chapter51);
        scenario.addChapter(chapter52);
        scenario.addChapter(chapter53);
        scenario.addChapter(chapter54);
        scenario.addChapter(chapter55);
        scenario.addChapter(chapter56);
        scenario.addChapter(chapter57);
        scenario.addChapter(chapter58);
        scenario.addChapter(chapter59);
        scenario.addChapter(chapter60);
        scenario.addChapter(chapter61);
        scenario.addChapter(chapter62);
        scenario.addChapter(chapter63);
        scenario.addChapter(chapter64);
        scenario.addChapter(chapter65);
        scenario.addChapter(chapter66);
        scenario.addChapter(chapter67);
        scenario.addChapter(chapter68);
        scenario.addChapter(chapter69);
        scenario.addChapter(chapter70);
        scenario.addChapter(chapter71);
        scenario.addChapter(chapter72);
        scenario.addChapter(chapter73);
        scenario.addChapter(chapter74);
        scenario.addChapter(chapter75);
        scenario.addChapter(chapter76);
        scenario.addChapter(chapter77);
        scenario.addChapter(chapter78);
        scenario.addChapter(chapter79);
        scenario.addChapter(chapter80);
        scenario.addChapter(chapter81);
        scenario.addChapter(chapter82);
        scenario.addChapter(chapter83);
        scenario.addChapter(chapter84);
        scenario.addChapter(chapter85);
        scenario.addChapter(chapter86);
        scenario.addChapter(chapter87);
        scenario.addChapter(chapter88);
        scenario.addChapter(chapter89);
        scenario.addChapter(chapter90);
        scenario.addChapter(chapter91);
        scenario.addChapter(chapter92);
        scenario.addChapter(chapter93);
        scenario.addChapter(chapter94);
        scenario.addChapter(chapter95);
        scenario.addChapter(chapter96);
        scenario.addChapter(chapter97);
        scenario.addChapter(chapter98);
        scenario.addChapter(chapter99);
        scenario.addChapter(chapter100);
        scenario.addChapter(chapter101);
        scenario.addChapter(chapter102);
        scenario.addChapter(chapter103);
        scenario.addChapter(chapter104);
        scenario.addChapter(chapter105);
        scenario.addChapter(chapter106);
        scenario.addChapter(chapter107);
        scenario.addChapter(chapter108);
        scenario.addChapter(chapter109);
        scenario.addChapter(chapter110);
        scenario.addChapter(chapter111);
        scenario.addChapter(chapter112);
        scenario.addChapter(chapter113);
        scenario.addChapter(chapter114);
        scenario.addChapter(chapter115);
        scenario.addChapter(chapter116);
        scenario.addChapter(chapter117);
        scenario.addChapter(chapter118);
        scenario.addChapter(chapter119);
        scenario.addChapter(chapter120);
        scenario.addChapter(chapter121);
        scenario.addChapter(chapter122);
        scenario.addChapter(chapter123);
        scenario.addChapter(chapter124);
        scenario.addChapter(chapter125);
        scenario.addChapter(chapter126);
        scenario.addChapter(chapter127);
        scenario.addChapter(chapter128);
        scenario.addChapter(chapter129);
        scenario.addChapter(chapter130);
        scenario.addChapter(chapter131);
        scenario.addChapter(chapter132);
        scenario.addChapter(chapter133);
        scenario.addChapter(chapter134);
        scenario.addChapter(chapter135);
        scenario.addChapter(chapter136);
        scenario.addChapter(chapter137);
        scenario.addChapter(chapter138);
        scenario.addChapter(chapter139);
        scenario.addChapter(chapter140);
        scenario.addChapter(chapter141);
        scenario.addChapter(chapter142);
        scenario.addChapter(chapter143);
        scenario.addChapter(chapter144);
        scenario.addChapter(chapter145);
        scenario.addChapter(chapter146);
        scenario.addChapter(chapter147);
        scenario.addChapter(chapter148);
        scenario.addChapter(chapter149);
        scenario.addChapter(chapter150);
        scenario.addChapter(chapter151);
        scenario.addChapter(chapter152);
        scenario.addChapter(chapter153);
        scenario.addChapter(chapter154);
        scenario.addChapter(chapter155);
        scenario.addChapter(chapter156);
        scenario.addChapter(chapter157);
        scenario.addChapter(chapter158);
        scenario.addChapter(chapter159);
        scenario.addChapter(chapter160);
        scenario.addChapter(chapter161);
        scenario.addChapter(chapter162);
        scenario.addChapter(chapter163);
        scenario.addChapter(chapter164);
        scenario.addChapter(chapter165);
        scenario.addChapter(chapter166);
        scenario.addChapter(chapter167);
        scenario.addChapter(chapter168);
        scenario.addChapter(chapter169);
        scenario.addChapter(chapter170);
        scenario.addChapter(chapter171);
        scenario.addChapter(chapter172);
        scenario.addChapter(chapter173);


        // Set the starting chapter
        scenario.setStartChapterId("5");

        return scenario;
    }
} 