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

        Chapter chapter0 = new Chapter("0", "Le Début de l'Aventure",
                "0\n" +
                        "— Si vous avez accompli une première mission dans le , Château des Ténèbres,\n" +
                        "rendez-vous au 1. Sinon, rendez-vous au 2.");
        chapter0.addChoice(new Choice("Page 1", "1"));
        chapter0.addChoice(new Choice("Page 2", "2"));

        Chapter chapter1 = new Chapter("1", "",
                "1\n" +
                        "— E. J. ! vous exclamez-vous ! Vous avez gardé E J. !\n" +
                        "— Bonjour, Pip, vous dit Excalibur Junior, l'épée parlante.\n" +
                        "Vous la regardez avec émotion, vous souvenant de l'aide qu'elle vous a apportée tout\n" +
                        "au long de vos aventures dans Le Château des Ténèbres, pour vaincre le redoutable\n" +
                        "Sorcier Ansalom. La présence d'E.J. est vraiment une bonne surprise. Car, grâce à\n" +
                        "cette épée merveilleuse, il vous suffira seulement d'obtenir un 4 en lançant les dés,\n" +
                        "pour porter le premier coup lorsque vous l'utiliserez dans un combat. De plus, lorsque\n" +
                        "vous obtiendrez des Points de Dommage, vous ajouterez 5 points supplémentaires (par\n" +
                        "exemple, si, en lançant les dés vous obtenez 7, les Points de Dommage que vous\n" +
                        "devrez soustraire des POINTS DE VIE de votre adversaire seront de : 7 — 4 = 3, + 5 =\n" +
                        "8). La mauvaise nouvelle , bien sûr, est qu'E.J. parle trop. Mais il va falloir vous en\n" +
                        "accommoder, comme la dernière fois ! Pendant que vous évoquez vos souvenirs avec\n" +
                        "E.J., Merlin sort un autre objet de son coffre : l'élégant pourpoint en peau de dragon\n" +
                        "que vous avez porté durant votre dernière mission, qui a le pouvoir d'annuler 4 Points\n" +
                        "de Dommage chaque fois que vous recevrez un coup. Voilà deux accessoires d'une\n" +
                        "grande importance, qui pourraient faire toute la différence entre la vie et la mort au\n" +
                        "cours de la périlleuse mission dans laquelle vous allez vous engager. Maintenant,\n" +
                        "rendez-vous 3\n");

        chapter1.addChoice(new Choice("Page 3", "3"));

        Chapter chapter2 = new Chapter("2", "",
                "2\n" +
                        "Voici, explique Merlin, Excalibur Junior. C'est une épée très spéciale. Je l'ai forgée\n" +
                        "moi-même, et je suis donc bien placé pour le savoir. Elle est la réplique exacte de\n" +
                        "l'épée du roi Arthur. La réplique exacte. en plus petit. Et elle parle, contrairement à\n" +
                        "Excalibur d'Arthur. Sans arrêt, quelquefois. Dis bonjour à Pip, E.J.\n" +
                        "â votre grande surprise, l'épée déclare docilement : bonjour, Pip.\n" +
                        "Dans un état proche de l'ébahissement, vous tendez la main et vous saisissez l'épée.\n" +
                        "Elle est parfaitement équilibrée, légère, mais certainement redoutable.\n" +
                        "— Ouaoh ! vous exclamez-vous, usant d'une expression peu courante à l'époque du roi\n" +
                        "Arthur.\n" +
                        "Mais Merlin semble la comprendre.\n" +
                        "— Ouaoh, comme tu dis ! commente-t-il. Quand tu te serviras de cette épée, il te\n" +
                        "suffira d'obtenir un 4 avec tes deux dés pour frapper un adversaire. Ça fait partie de la\n" +
                        "magie. Et ce n'est pas tout : tu pourras ajouter 5 points aux Points de Dommage que tu\n" +
                        "lui causeras. Ça aussi, ça fait partie de la magie.\n" +
                        "— vous avez E.J. bien en main ? Alors, rendez-vous au 4\n");

        chapter2.addChoice(new Choice("Page 4", "4"));

        Chapter chapter3 = new Chapter("3", "",
                "3\n" +
                        "en accomplissant votre quete dans Le Château des Ténèbres ,vous avez peut etre\n" +
                        "découvert quelques objets intéressants que vous avez remporté avec vous.ils peuvent\n" +
                        "faire partie de votre équipement dans cette nouvelle aventure, mais seulement si vous\n" +
                        "les avez vraiment trouvés dans le Château, et s'ils étaient encore en votre possession à\n" +
                        "la fin de votre mission voici la liste des objets qui étaient cachés dans le château.et ne\n" +
                        "trichez pas ,sinon le sortilège sera rompu.\n" +
                        "1 : La Pierre de Chance .cette pierre vous permet de rajouter ou de retrancher 3\n" +
                        "points à tous les résultats que vous obtiendrez en lançant les dés..\n" +
                        "2 : La Pièce de Cuivre a double face une pièce très utile dans les jeux de hazard\n" +
                        ",puisqu’elle permet de tricher comme un fou ,et de gagner à tous les coups !quant à\n" +
                        "savoir à combien de jeux de hazards vous allez jouer dans cette histoire ,c est une\n" +
                        "autre affaire ,mais on ne sait jamais.\n" +
                        "3 : L'Anneau Sonore du Zombie jusqu’ici personne n’a encore tres bien compris\n" +
                        "comment fonctionnait l’anneau sonore . Mais son action semble réellement magique\n" +
                        "aussi mieux vaut l emporter.\n" +
                        "4 : la Baguette à Bulles du laboratoire d'Ansalom .elle projete une bulle verte\n" +
                        "lumineuse qui handicape un adversaire à un point tel qu il est possible de le frapper\n" +
                        "quatre fois avant qu’il ne puisse répliquer lancez un dé : le chiffre obtenu sera le\n" +
                        "nombre de bulles dont vous disposerez lors de cette aventure.\n" +
                        "5 : Le Canard magique donné par Nosférax .ce petit canard mettra en échec toute\n" +
                        "opération magique tentée contre vous(ou autour de vous) par exemple une boule de feu\n" +
                        "s éteindra immédiatement ou une créature invisible deviendra visible .Vous ne pourrez\n" +
                        "utiliser le canard qu une seule fois au cours de la mission.\n" +
                        "6 : Parchemin de Guérison. Il s'agit d'un sortilège qui, lu a haute voix, vous restituera\n" +
                        "tous vos POINTS DE VIE. Il ne peut être utilisé qu'une seule fois. 7 : Parchemin de\n" +
                        "Téléportage. Un sortilège qui vous emmènera instantanément à n'importe quelle sec-\n" +
                        "non visitée précédemment (les sections seront expliquées plus loin). Le Parchemin ne\n" +
                        "peut être utilisé qu'une fois.\n" +
                        "8 : parchemin de Mort. Ce Parchemin peut ôter la vie à toute créature, vous compris.\n" +
                        "Lorsque vous l'utiliserez, vous lancerez deux dés. Si vous faites un double 6, un\n" +
                        "double 3 ou un double 1, vous etes mort. Sinon, vous avez tué votre adversaire, aussi\n" +
                        "puissant soit-il. Attention : vous ne pouvez emporter les objets 6, 7 et 8, que si vous ne\n" +
                        "les avez pas utilisés dans Le Château des Ténèbres.\n" +
                        "9 : Parchemin d'Hypnotisme. Vous devrez obtenir au minimum 5 en lançant deux\n" +
                        "dés, pour que ce sortilege opère. Votre adversaire tombera alors dans une espèce de\n" +
                        "léthargie, et ne présentera plus aucun danger pour vous. Malheureusement, ce sortilège\n" +
                        "n'a aucun pouvoir sur les Dragons.\n" +
                        "10 : Parchemin d'Antidote au Poison. Peut être utilisé contre tout empoisonnement.\n" +
                        "11 : La Boule de Cristal du laboratoire d'Ansalom. Elle est maintenant brisée. Vous\n" +
                        "pouvez l'emporter , si vous le désirez, mais elle ne fonctionnera pas.\n" +
                        "12 : Si vous n'avez pas utilisé tous les Éclairs de Doigt de Feu, ou toutes les\n" +
                        "Boules de Feu dont vous disposiez au cours de votre dernière mission, vous\n" +
                        "pourrez les ajouter à ceux que vous vous procurerez peut-être au cours de cette\n" +
                        "présente mission. Ils opéreront cette fois de façon légèrement » différente,\n" +
                        "comme vous le découvrirez.\n" +
                        "13. Vous pouvez prendre jusqu'à 10 points des points permanents de vie que\n" +
                        "vous avez gagnés au cours de votre mission dans Le Château des Ténèbres, et les\n" +
                        "ajouter à votre total de départ de points de vie. Notez dans la case Équipement de\n" +
                        "votre Feuille d'Aventure ce que vous désirez emporter avec vous, et rendez-vous\n" +
                        "au 4.\n");

        chapter3.addChoice(new Choice("Page 4", "4"));

        Chapter chapter4 = new Chapter("4", "",
                "4\n" +
                        "Merlin tire de la manche de son ample robe un dernier rouleau de parchemin,\n" +
                        "jauni par l'âge (à moins que ce ne soit par le thé), et maculé des taches habituelles.\n" +
                        "Pour finir, dit-il, voici ta carte. C'est une copie d'une carte très rare et très ancienne que\n" +
                        "j'ai dessinés moi-même. La copie, je veux dire, pas la vieille carte. Ne l'égare pas,\n" +
                        "sinon tu ne saurais pas vers où te diriger. Elle t'indique comment parvenir à l'Antre du\n" +
                        "Dragon. Très peu de gens en connaissent le chemin. En fait, je suis peut-être le seul.\n" +
                        "Mais maintenant, tu partages ce secret. Prépare soigneusement ton voyage, et suis\n" +
                        "attentivement les indications portées sur la carte. Mais une fois dans l'Antre du Dra-\n" +
                        "gon, tu devras te débrouiller seul, j'en ai peur, car personne n'a jamais réussi à en\n" +
                        "établir le plan. Allez, en route, maintenant.\n" +
                        "Et Merlin, qui malgré toutes ses étourderies n'en demeure pas moins le plus grand\n" +
                        "magicien d'Avalon, agite les bras en d'étranges figures. Lentement, mais\n" +
                        "inexorablement, lui et sa grotte commencent a s'effacer, pour disparaître bientôt\n" +
                        "complètement.\n" +
                        "Vous sentez maintenant que l'on vous pousse dans le dos, Pip. Vous vous retournez,\n" +
                        "plongeant votre regard dans les beaux yeux tendres de Wanda la Vagabonde, votre\n" +
                        "vache favorite dans le petit troupeau que possèdent vos parents d'adoption, John le\n" +
                        "fermier, et Mary la fermière. Et s'il s'agit de Wanda la Vagabonde, c'est que le\n" +
                        "pâturage dans lequel vous vous trouvez s'étend derrière la ferme où vous vivez.\n" +
                        "comment avez-vous bien pu arriver là ? Seul Merlin pourrait le dire. Mais, en jetant un\n" +
                        "coup d'œil à vos pieds, vous apercevez les divers objets de votre équipement, pour\n" +
                        "lesquels vous avez dépensé votre or dans la Grotte de Cristal. Qui plus est, vous tenez\n" +
                        "dans votre main un rouleau de parchemin jauni par le temps (à moins que ce ne soit\n" +
                        "par le thé de Merlin), sur lequel est dessiné une carte. n'est-ce pas la carte la plus\n" +
                        "étrange que vous ayez jamais vue de votre vie ? Tout à fait différente de celles que\n" +
                        "l'on placarde sur tous les murs des classes de géographie. De simples pointillés qui\n" +
                        "représentent peut-être des routes (ou autre chose). Et des numéros de sections.\n" +
                        "Comment Merlin savait-il où vous seriez lorsque vous dérouleriez la carte ? Mystère !\n" +
                        "Il a dit que c'était une copie d'une très vieille carte : comment le cartographe\n" +
                        "d'autrefois savait-il où vous seriez? Ou que Wanda la Vagabonde vous pousserait dans\n" +
                        "le dos avec son museau ? Et pourtant, vous êtes bien là, indiqué par un X. Et voilà\n" +
                        "Wanda, grandeur nature. Enfin, presque ! Enfin, c'est la seule piste que vous possédiez\n" +
                        "pour découvrir l'Antre du Dragon. Vous avez donc tout intérêt à vous en servir.\n" +
                        "Choisissez un itinéraire, et suivez-le jusqu'à ce que vous arriviez à une section\n" +
                        "numérotée. Et rendez-vous à la séquence portant ce numéro. N’oubliez pas d'emporter\n" +
                        "votre équipement et vos armes (ainsi que vos sortilèges !) Sur la carte, vous avez\n" +
                        "remarqué que l'entrée de l'Antre du Dragon n' est pas indiquée. Peut-être parce qu'elle\n" +
                        "est secrète. Mais elle doit être là, quelque part, dans l'une de ces sections, par exemple.\n" +
                        "Il va falloir vous mettre en route pour la découvrir, Pip ! Car, où qu'elle soit...\n" +
                        "L'aventure commence !\n");

        chapter4.addChoice(new Choice("Page 21", "21"));
        chapter4.addChoice(new Choice("Page 65", "65"));
        chapter4.addChoice(new Choice("Page 58", "58"));
        chapter4.addChoice(new Choice("Page 155", "155"));

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

        chapter14.addChoice(new Choice("Vous êtes mort !", "4"));

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
        chapter20.addChoice(new Choice("Carte du Village", "10"));

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

        chapter29.addChoice(new Choice("Carte de Merlin", "4"));

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
        chapter38.addChoice(new Choice("Carte du Village", "10"));

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
        chapter39.addChoice(new Choice("Carte du Village", "10"));

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
                        "Dites-moi, Pip : qu'est-ce qui est vert vif avec des dents rouges, se tient debout sur\n" +
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

        chapter41.addChoice(new Choice("Carte du Village", "10"));
        chapter41.addChoice(new Choice("Page 14", "14"));

        Chapter chapter42 = new Chapter("42", "",
                "42\n" +
                        "Vous n'allez jamais le croire, Pip. Le soleil brille partout et Wanda la Vagabonde\n" +
                        "vous pousse dans le dos avec son mufle, l'air stupide. Vous avez bouclé la boucle et\n" +
                        "vous vous retrouvez à votre point de départ. Mieux vaut examiner à nouveau la carte\n" +
                        "que Merlin vous a donnée et refaire une tentative ! Vous pouvez choisir n'importe\n" +
                        "laquelle des sections indiquées pour reprendre le départ.\n");

        chapter42.addChoice(new Choice("Carte de Merlin", "4"));

        Chapter chapter43 = new Chapter("43", "",
                "43\n" +
                        "Ah, il semble que nous progressions ! Il existe une porte de derrière à cette chaumière.\n" +
                        "Si vous décidez de franchir la porte du fond, rendez- vous au 92.\n" +
                        "Si vous préférez vous en abstenir, retournez à votre carte et reprenez votre exploration.\n");

        chapter43.addChoice(new Choice("Page 92", "92"));
        chapter43.addChoice(new Choice("Carte de Merlin", "4"));

        Chapter chapter44 = new Chapter("44", "",
                "44\n" +
                        "L’une au moins vous a blessé. Si vous faites de 7 à 12, vous les avez évitées par\n" +
                        "miracle. S vous êtes embroché, lancez vos dés de nouveau pour savoir quels\n" +
                        "dommages ont subi vos POINTS DE Si vous n'avez plus de points, vous êtes mort, et\n" +
                        "rendez-vous au 14. Si vous êtes toujours en vie, les mauvaises nouvelles ne font que\n" +
                        "commencer : les piques sont empoisonnées. Lancez deux dés de nouveau pour savoir\n" +
                        "si vous êtes naturellement immunisé. De 2 à 6, le poison ne vous fait aucun mal. De 7à\n" +
                        "12, le poison est mortel ; rendez-vous au 14. Même si vous n'êtes pas tombé sur les\n" +
                        "piques, il vous faut néanmoins sortir de là. Si vous avez emporté du matériel\n" +
                        "d'escalade, comme des crampons et une corde, vous pouvez remonter assez facilement.\n" +
                        "reprenez votre carte et explorez une autre partie du village. Si vous ne disposez pas du\n" +
                        "matériel nécessaire, vous êtes prisonnier de la fosse où vous allez mourir de faim.\n" +
                        "Rendez-vous au 14.\n");

        chapter44.addChoice(new Choice("Page 14", "14"));
        chapter44.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter45 = new Chapter("45", "",
                "45\n" +
                        "Comme c'est étrange : cette demeure ressemble à une chaumière, elle a la forme d'une\n" +
                        "chaumière et la taille d'une chaumière, mais maintenant que vous en etes proche, vous\n" +
                        "constatez que ce n'est pas une chaumière, mais un énorme rocher coiffé d'un toit de\n" +
                        "chaume. Vous pourriez passer l'éternité entière à essayer de comprendre ce prodige.\n" +
                        "Mais il est sans doute plus intelligent de reprendre votre carte, et d'aller faire un tour\n" +
                        "ailleurs.\n");

        chapter45.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter46 = new Chapter("46", "",
                "46\n" +
                        "— Bonjour, petite personne, déclare quelque part au -dessus de vous une voix\n" +
                        "profonde, mais curieusement bruyante.\n" +
                        "Vous levez la tête vers les branches de l'arbre, mas vous ne voyez personne.\n" +
                        "— Non, bien sûr, reprend clairement la voix. Ou plutôt si. C'est moi que vous regardez.\n" +
                        "— Mais je ne vous vois pas, protestez-vous.\n" +
                        "— Si, vous me voyez.\n" +
                        "— Vous voulez dire ... que vous êtes l'arbre? Un arbre qui parle ?\n" +
                        "— Oui, mais je ne suis pas un vieil arbre ordinaire, dit la voix. Je suis le Chêne du\n" +
                        "Druide. C'est là un arbre tout à fait spécial. Entre parenthèses, méfiez- vous du Lapin,\n" +
                        "il a des dents empoisonnées.\n" +
                        "— Merci de me prévenir, répliquez-vous poliment bien qu'abasourdi de parler à un\n" +
                        "arbre (ou du moins de parler à un arbre qui répond). Vous ne savez pas. par hasard,\n" +
                        "comment on sort de cette forêt ?\n" +
                        "— Si, bien sûr. Je vis ici depuis cent ans, pas vrai Et une de ses grosses branches\n" +
                        "s'incline, comme ployée par un vent violent, et vous indique le nord- est.\n" +
                        "Si vous décidez de faire confiance à l'arbre, rendez- vous au 77.\n" +
                        "Sinon, retournez au 11 et faites un nouveau choix.\n");

        chapter46.addChoice(new Choice("Page 77", "77"));
        chapter46.addChoice(new Choice("Page 11", "11"));

        Chapter chapter47 = new Chapter("47", "",
                "47\n" +
                        "Le Comte Dracula disait volontiers que lorsqu'on avait vu une crypte, on les avait\n" +
                        "toutes vues. Mais quoi qu'il en soit, cette crypte-là semble vraiment tout à fait\n" +
                        "spéciale. Pour commencer, elle est toute entière en marbre rose. Et, en plus, sur une\n" +
                        "plaque en cuivre ornant la lourde porte de bois sont gravés les vers suivants :\n" +
                        "Oh, voyageur lassé aux pieds si douloureux,\n" +
                        "Aux pieds si poussiéreux,\n" +
                        "Aux cheveux pleins de poux,\n" +
                        "Entre ici pour y prendre un peu de répit.\n" +
                        "Moi, de ma poésie, je vais te régaler.\n" +
                        "Franchis ce seuil, voyageur esseulé\n" +
                        "Et partage avec moi ce toit si doux.\n" +
                        "Une seule créature au monde pourrait écrire un poème aux rimes si désastreuses. Sa\n" +
                        "renommée est telle que tout le monde, ou presque, à Avalon a entendu parler de lui à\n" +
                        "un moment ou à un autre S'agirait-il de... Mais oui ! En dessous du poème se trouve\n" +
                        "une autre plaque, en fer celle-là, portant les mots :\n" +
                        "CRYPTE DE NOSFÉRAX (Prière de frapper).\n" +
                        "Ne perdez plus une seconde ! Ceci sera certainement dangereux, mais le jeu devrait en\n" +
                        "valoir la chandelle Entrez ! Entrez !\n" +
                        "Si vous décidez de pénétrer dans la Crypte de Nosférax, rendez-vous au 107.\n" +
                        "Sinon, retournez à votre carte et explorez une autre partie du village.\n");

        chapter47.addChoice(new Choice("Page 107", "107"));
        chapter47.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter48 = new Chapter("48", "",
                "48\n" +
                        "Vous entrez dans la chaumière et tout l'édifice s'écroule sur vous. Ce n'est parfois pas\n" +
                        "drôle d'être un aventurier, Pip ! Rendez-vous au 14.\n");

        chapter48.addChoice(new Choice("Page 14", "14"));

        Chapter chapter49 = new Chapter("49", "",
                "49\n" +
                        "Vous vous collez comme vous le pouvez à la paroi et vous amorcez une périlleuse\n" +
                        "descente, centimètre par centimètre, cherchant des prises quasiment inexistantes sous\n" +
                        "vos pieds. Du fond de l'abîme souffle un vent violent dont la puissance augmente\n" +
                        "encore de façon alarmante pendant votre descente Maintenant que vous vous êtes\n" +
                        "vraiment lancé dans cette entreprise, l'abîme paraît beaucoup plus profond que vous ne\n" +
                        "l'aviez imaginé. Beaucoup plus profond...\n" +
                        "Ne regardez pas vers le bas ! La falaise se dérobe en dessous de vous sur des kilo-\n" +
                        "mètres, et des kilomètres, et des kilomètres, et... Ne regardez pas vers le bas ! ... des\n" +
                        "kilomètres, et des kilomètres, et des kilomètres, et... vous êtes pris de vertige... Vous\n" +
                        "tombez ! Rendez-vous au 14.\n");

        chapter49.addChoice(new Choice("Page 14", "14"));

        Chapter chapter50 = new Chapter("50", "",
                "50\n" +
                        "Grrrrrr !\n" +
                        "Quel bruit affreux à entendre quand vous ouvrez la porte d'une chaumière, Pip. Il fait\n" +
                        "sombre à l'intérieur, et pendant un moment, vous ne distinguez que deux yeux rouges\n" +
                        "aux reflets sauvages. Le Loup vous saute alors à la gorge ! Il est gigantesque — 31\n" +
                        "POINTS DE VIE — et ses crocs infligent 3 Points de Dommage. Bénéficiant de l'effet de\n" +
                        "surprise, il frappe également le premier. En outre, son épaisse fourrure lui tient lieu\n" +
                        "d'armure en un sens, ce qui retire 1 point à tous les Points de Dommage que vous\n" +
                        "pouvez lui infliger. Lancez les dès. Vous avez un autre combat sur les bras.\n" +
                        "si le Loup vous tue, rendez-vous au 14. Si vous tuez le Loup, vous aller trouver dans la\n" +
                        "chaumière un coffret contenant 100 Pièces d'Or, prenez-le, retournez à votre carte et\n" +
                        "explorez une autre section du village.\n");

        chapter50.addChoice(new Choice("Page 14", "14"));
        chapter50.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter51 = new Chapter("51", "",
                "51\n" +
                        "si vous n'étiez pas un aventurier aussi chevronné, vous auriez pensé qu'il s'agissait\n" +
                        "simplement d'une vieille maison abandonnée. Personne, aucun objet de valeur,\n" +
                        "quelques débris de vieux meubles... Le genre d'endroit qui vous incite à tourner\n" +
                        "aussitôt les talons pour ressortir. Mais vous ne l'avez pas fait, n'est-ce pas ? En\n" +
                        "tâtonnant le long des murs et au- dessus de la cheminée, vous avez trouvé un drôle de\n" +
                        "petit bouton. Quand vous avez tourné ce drôle de petit bouton, une drôle de petite\n" +
                        "porte dérobée s'est ouverte dans le mur, donnant sur un drôle de petit passage secret.\n" +
                        "evidemment, vous n'êtes pas obligé d'explorer ce passage secret. Vous pouvez\n" +
                        "simplement vous reporter a votre carte du village et en explorer une autre partie. Mais\n" +
                        "si vous voulez en réalité explorer le passage secret, cela vous conduit au 90.\n");

        chapter51.addChoice(new Choice("Carte du Village", "10"));
        chapter51.addChoice(new Choice("Page 90", "90"));

        Chapter chapter52 = new Chapter("52", "",
                "52\n" +
                        "Quelqu'un aime vraiment les plantes vertes. quand vous entrez dans cette chaumière, il\n" +
                        "vous vient aussitôt à l'esprit l'image d'une charmante vieille dame s'affairant dans le\n" +
                        "calme de son logis campagnard. La maison est absolument envahie par la verdure. Des\n" +
                        "fougères... des palmiers nains... des caoutchoucs... des bonsaï... des plantes grimpantes\n" +
                        "Beaucoup de plantes grimpantes. Il y en a partoui Et elles bougent ! Elles s'enroulent\n" +
                        "autour de vous. Pip ! Lancez deux dés pour voir si vous pouvez dégager le bras qui\n" +
                        "manie l'épée.\n" +
                        "Si vous faites de 2 à 6, vous êtes fermement immobilisé. Incapable de lutter, vous\n" +
                        "serez lentement étranglé et digéré par les plantes grimpantes. Abrégez vos souffrances\n" +
                        "en vous rendant immédiatement au 14 Si vous faites de 7 à 12, vous dégainez votre\n" +
                        "épée. Dès lors, le problème est réglé. Vous hachez menu ces horribles plantes\n" +
                        "grimpantes sans subir le moindre dommage. Ça leur apprendra ! Maintenant reprenez\n" +
                        "votre carte et allez explorer une autre partie du village.\n");

        chapter52.addChoice(new Choice("Page 14", "14"));
        chapter52.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter53 = new Chapter("53", "",
                "53\n" +
                        "Comme aventurier, vous vous posez là. Pas même capable de trouver votre chemin\n" +
                        "pour sortir de... oh. peu importe ! Lancez les dés de nouveau. Et tâchez de vous y\n" +
                        "prendre correctement cette fois !\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 73.\n" +
                        "de 7 à 12 : rendez-vous au 17.\n");

        chapter53.addChoice(new Choice("Page 73", "73"));
        chapter53.addChoice(new Choice("Page 17", "17"));

        Chapter chapter54 = new Chapter("54", "",
                "54\n" +
                        "Quel vaste bâtiment. En y pénétrant, vous constatez que c'est un silo à grains. Mais\n" +
                        "comme tout le reste dans ce village misérable, les grains sentent vraiment le moisi.\n" +
                        "Si vous pensez ne rien y trouver d'intéressant, reprenez votre carte et explorez un autre\n" +
                        "secteur du village.\n" +
                        "Si vous voulez explorer plus minutieusement le silo à grains, rendez-vous au 104.\n");

        chapter54.addChoice(new Choice("Carte du Village", "10"));
        chapter54.addChoice(new Choice("Page 104", "104"));

        Chapter chapter55 = new Chapter("55", "",
                "55\n" +
                        "— Halte, Manant ! Comment oses-tu troubler mes méditations ?\n" +
                        "Vous ne vous attendiez pas à entendre ce genre de propos en pénétrant dans une\n" +
                        "chaumière, à la campagne, mais vos oreilles ne vous ont pas trompé. Et ces mots\n" +
                        "sortent de la bouche d'un personnage couvert des pieds à la tête d'une armure aussi\n" +
                        "noire que le jais. Serait-ce le célèbre (et très redoutable) Chevalier Noir dont le nom\n" +
                        "n'est prononcé qu'à voix basse à Avalon ?\n" +
                        "Si VOUS avez déjà traversé précédemment le Château des Ténèbres du Magicien\n" +
                        "Ansalom, rendez-vous au 96.\n" +
                        "Si vous voulez vous adresser poliment au personnage en armure, vous pouvez le faire,\n" +
                        "avant de battre prudemment en retraite. Reprenez ensuite votre carte, et explorez une\n" +
                        "autre partie du village. Si vous voulez vous faire une réputation en défiant le Chevalier\n" +
                        "Noir, rendez-vous au 118.\n");

        chapter55.addChoice(new Choice("Page 96", "96"));
        chapter55.addChoice(new Choice("Page 118", "118"));
        chapter55.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter56 = new Chapter("56", "",
                "56\n" +
                        "C'est dangereux, sans aucun doute, de se rendre dans cet endroit fait remarquer le petit\n" +
                        "homme. Et, bien difficile d'y arriver, si on ne connaît pas le chemin ; mais, enfin, c'est\n" +
                        "toujours difficile d'aller quelque part sans connaître le chemin.\n" +
                        "— Et vous, vous connaissez le chemin ? demandez- vous vivement, puisque, d'après\n" +
                        "ces remarques, il semble pour la première fois que vous soyez sur la bonne voie.\n" +
                        "— Je le connais, dit le petit homme. Du moins en théorie, car je n'y suis moi-même\n" +
                        "jamais allé et n'ai pas la moindre intention non plus de m'y rendre Mais, si vous êtes\n" +
                        "bien décidé, ce serait vraiment mesquin de ma part de ne pas vous mettre sur la bonne\n" +
                        "route, en remerciement de votre générosité J'ai bien peur, néanmoins, que vous ne\n" +
                        "soyez oblige de traverser le village que vous voyez là-bas.\n" +
                        "— Pourquoi avez-vous peur? demandez-vous en fronçant les sourcils.\n" +
                        "— Parce que c'est un endroit que vous feriez mieux d'éviter. Contrairement à l'Antre du\n" +
                        "Dragon, voyez- vous, je suis allé au village de Pierre-qui-Mue (c'est le nom de cet\n" +
                        "endroit maudit) et j'ai eu bien de la chance de m'en sortir indemne. Mais enfin, si vous\n" +
                        "voulez arriver à l'Antre du Dragon, la seule solution, c'est de traverser le village.\n" +
                        "— Je me dirige depuis un bon moment vers ce village, lui expliquez-vous, mais sans\n" +
                        "jamais m'en rapprocher.\n" +
                        "Ah ça ne m'étonne pas. Il n'y a qu'un chemin pour y arriver, et la plupart des gens le\n" +
                        "ratent invariablement. Félicitez-vous donc de m'avoir rencontré, car je peux vous\n" +
                        "indiquer la bonne route. Là- dessus, il se penche vers vous et vous chuchote quelques\n" +
                        "mots à l'oreille. Vous remerciez le petit homme, vous rassemblez vos affaires (en\n" +
                        "prenant soin de ne rien laisser derrière vous) et vous repartez en traînant la jambe, à la\n" +
                        "recherche du 13.\n");

        chapter56.addChoice(new Choice("Page 13", "13"));

        Chapter chapter57 = new Chapter("57", "",
                "57\n" +
                        "De près, le site n'est pas aussi impressionnant qu'il le paraissait de loin. En fait, il n'est\n" +
                        "pas impressionnant du tout. Peut-être était-ce jadis une très belle abbaye, mais il n'en\n" +
                        "reste guère que des ruines. Des murs croulants, ou près de s'écrouler. Et pourtant, les\n" +
                        "lieux, sauf erreur, sont encore habités. venant vers vous, le visage dissimulé derrière le\n" +
                        "volumineux capuchon de leurs volumineuses robes noires, six Moines s'approchent.\n" +
                        "Comptez-les. Celui quj marche en tête porte une bannière brodée fixée au bout d'une\n" +
                        "longue hampe. Vous levez les yeux vers la bannière. Elle est ornée d'une tête de mort\n" +
                        "couleur or. Le suivant porte un encensoir dans lequel il doit brûler des vieilles\n" +
                        "chaussettes, à en juger par la puanteur qui s'en dégage. Ils se tournent dans votre\n" +
                        "direction. Ils psalmodient. Voici ce qu'ils chantent : « Viens avec nous, petit\n" +
                        "aventurier, et reste avec nous à jamais. »\n" +
                        "Si vous voulez rester avec eux à jamais, rendez-vous au 110.\n" +
                        "Si vous prenez vos jambes à votre cou séance tenante, vous pouvez reprendre votre\n" +
                        "carte et explorer une autre partie du village. (Les Moines ne vous suivront pas en\n" +
                        "dehors de leur abbaye.) Si vous vous demandez quelles sont vos chances en cas\n" +
                        "d'échauffourée, sachez, et c'est une bonne nouvelle, que les deux premiers Moines\n" +
                        "s'abstiendront d'intervenir. Les quatre autres, en revanche, sont des Moines Guerriers,\n" +
                        "disposant chacun de 25 POINTS DE VIE. Ils combattent à mains nues, et ils vous\n" +
                        "infligeront 3 Points de Dommage supplémentaires en plus de ceux qu'ils pourront vous\n" +
                        "infliger normalement. Vous les combattrez chacun à leur tour. Mais ils sont si rapides,\n" +
                        "qu'ils vous frapperont une fois tous les quatre avant que vous ne puissiez riposter\n" +
                        "Ensuite, ils ne devront faire que 4 pour vous porter un coup. Maintenant c'est à vous de\n" +
                        "savoir si vous voulez les affronter ou non. Dans le premier cas, si vous êtes vaincu,\n" +
                        "rendez-vous au 14. Si vous êtes vainqueur, rendez-vous au 94.\n");

        chapter57.addChoice(new Choice("Page 110", "110"));
        chapter57.addChoice(new Choice("Carte du Village ", "10"));
        chapter57.addChoice(new Choice("Page 14", "14"));
        chapter57.addChoice(new Choice("Page 94", "94"));

        Chapter chapter58 = new Chapter("58", "",
                "58\n" +
                        "Il semble que vous approchiez d'une ville. Ou plutôt d'un village. La première chose\n" +
                        "que vous remarquez, c'est le clocher de l'église puis, tandis que vous poursuivez\n" +
                        "péniblement votre chemin, apparaissent les toits de chaume des chaumières. Le seul\n" +
                        "problème, c'est que vous avez beau marcher, marcher, le village, pourtant bien visible,\n" +
                        "reste toujours aussi éloigné. Il y a vraiment de la magie dans l'air. Mieux vaut lancer\n" +
                        "dès maintenant vos dés, pour savoir s'il y a un moyen d'atteindre ce village.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 4 : rendez-vous au 9.\n" +
                        "de 5 à 8 : rendez-vous au 13.\n" +
                        "de 9 à 12 : rendez-vous au 19.\n");

        chapter58.addChoice(new Choice("Page 9", "9"));
        chapter58.addChoice(new Choice("Page 13", "13"));
        chapter58.addChoice(new Choice("Page 19", "19"));

        Chapter chapter59 = new Chapter("59", "",
                "59\n" +
                        "Un vent violent se lève et vous avez de plus en plus de mal à rester cramponné contre\n" +
                        "la paroi de la falaise. Même avec votre matériel, il faudrait être un grimpeur\n" +
                        "expérimenté pour effectuer cette descente. Des rafales s'engouffrent dans vos\n" +
                        "vêtements, vous secouent menaçant de vous arracher à vos prises et de vous envoyer\n" +
                        "vous fracasser plus bas. Mais vous mobilisez toute l'énergie et toute la volonté que\n" +
                        "vous possédez et vous vous agrippez farouchement. Vous avez les muscles noués par\n" +
                        "l'effort, les membres douloureux. Mais votre détermination farouche et vos doigts\n" +
                        "d'acier finissent par l'emporter... Du beau travail, vraiment, Pip ! Vous vous retrouvez\n" +
                        "au fond du gouffre. Il ne reste plus maintenant qu'un petit problème à résoudre :\n" +
                        "comment franchir le torrent furieux qui coule maintenant devant vous ? Vous\n" +
                        "considérez la rive d'en face, vous rappelant peut-être pour la première fois que vous\n" +
                        "ignorez si le corps de Pip que vous occupez a jamais appris à nager. Et votre seule\n" +
                        "solution ici, c'est de traverser à la nage. Plongez courageusement dans les eaux\n" +
                        "glacées, Pip, puis lancez les dés pour savoir ce qui va se passer.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 68.\n" +
                        "de 7 à 12 : rendez-vous au 78.\n");

        chapter59.addChoice(new Choice("Page 68", "68"));
        chapter59.addChoice(new Choice("Page 78", "78"));

        Chapter chapter60 = new Chapter("60", "",
                "60\n" +
                        "N'avez-vous rien de mieux à faire que de fixer le fond d'un puits, Pip ?\n" +
                        "Particulièrement un puits où se trouve un Farfadet des Eaux. Parfaitement, un\n" +
                        "farfadet des Eaux !\n" +
                        "Cette créature ne possède que 10 POINTS DE VIE, mais si cette nouvelle paraît bonne,\n" +
                        "réfléchissez à deux fois : seule la magie peut la neutraliser. Il va falloir utiliser le\n" +
                        "sortilège FIP ou le sortilège HEP (s'il vous en reste).\n" +
                        "S l'un ou l'autre des sortilèges opère, la créature meurt et vous pouvez reprendre votre\n" +
                        "carte et continuer à explorer le village.\n" +
                        "Si le sortilège échoue ou qu'il ne vous reste plus de sortilèges, la créature va absorber\n" +
                        "vos POINTS DE VIE comme une éponge. Rendez-vous au 14.\n");

        chapter60.addChoice(new Choice("Page 14", "14"));
        chapter60.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter61 = new Chapter("61", "",
                "61\n" +
                        "Vous savez quoi ? Pour la première fois dans ce village rébarbatif, vous avez trouvé un\n" +
                        "endroit qui degage une plaisante atmosphère. Vous vous attardez sur le seuil de la\n" +
                        "chaumière, vous laissant envahir par cette agréable sensation. Si vous étiez à court de\n" +
                        "POINTS DE VIE, cette demeure vous a rendu toute votre force, et vous vous retrouvez\n" +
                        "donc en possession de votre total de départ de POINTS DE VIE. Qu'est-ce que vous\n" +
                        "en dites ? Qui plus est, vous pouvez revenir ici après (mais pas pendant) l'exploration\n" +
                        "de n'importe quel endroit du village pour retrouver vos POINTS DE VIE à condition,\n" +
                        "bien entendu, que vous soyez encore dans le village. Maintenant reprenez votre carte\n" +
                        "et explorez ailleurs et ne vous plaignez pas qu'il ne vous arrive jamais rien d'agréable.\n");

        chapter61.addChoice(new Choice("Page 10", "10"));

        Chapter chapter62 = new Chapter("62", "",
                "62\n" +
                        "Vous vous dirigez vers le nord sur une courte distance avant de découvrir que vous\n" +
                        "avez fait un mauvais choix. Le sol se fissure brusquement sous vos pieds, et vous\n" +
                        "plongez dans un ruisseau de lave souterrain. Ce n'est qu'un tout petit ruisseau, mais là\n" +
                        "n'est pas la question. Même un ruisselet de lave suffit à venir à bout d'à peu près\n" +
                        "n'importe qui. Rendez-vous au 14.\n");

        chapter62.addChoice(new Choice("Page 14", "14"));

        Chapter chapter63 = new Chapter("63", "",
                "63\n" +
                        "En approchant de cette chaumière, vous savez aussitôt qu'elle doit être habitée\n" +
                        "puisqu'un filet de fumée sort de la cheminée. Cette supposition se confirme quand,\n" +
                        "après avoir frappé poliment, vous entendez une voix répondre : Entrez !\n" +
                        "Cette voix vous est vaguement familière : non que vous l'ayez déjà entendue mais ses\n" +
                        "inflexions ne vous sont pas inconnues. Vous entrez et vous voyez, assis dans un\n" +
                        "fauteuil à bascule devant le feu, une pipe en écume fichée entre les dents... un Vieux\n" +
                        "du Pays en personne !\n" +
                        "— Je pensais bien que vous alliez arriver d'un moment à l'autre, déclare-t-il en vous\n" +
                        "dévisageant d'un regard à la fois soulagé, soupçonneux et vindicatif. Vous êtes à la\n" +
                        "recherche du Dragon de Bronze, pas vrai ?\n" +
                        "—Eh bien, à vrai dire... commencez-vous. Mais comme la plupart des Vieux du Pays,\n" +
                        "il parle plus qu' il n'écoute et il vous interrompt en secouant la\n" +
                        "tete.\n" +
                        "— Eh bien, jeune homme, c'est pas ici que vous le trouverez, faites-moi confiance.\n" +
                        "Tous les présages sont mauvais.\n" +
                        "— Non, répondez-vous. Je ne m'attendais pas vraiment à trouver...\n" +
                        "— Il faut aller jeter un coup d'oeil dans l'Antre du Dragon, vous coupe-t-il. C'est là que\n" +
                        "vous avez le plus de chance de le trouver, s'il n'est pas en train de ravager et de piller\n" +
                        "le pays, et de dévorer des évêques presbytériens ou autres personnages du même\n" +
                        "acabit.\n" +
                        "—Ma foi, en réalité, je cherchais justement l'Antre du Dragon. Vous ne savez pas, par\n" +
                        "hasard, où...\n" +
                        "— Et ne me demandez pas où peut bien se trouver l\"Antre du Dragon, interrompt\n" +
                        "encore une fois le Vieux du Pays. Je n'approuve pas ce genre d'endroits. Ce sont des\n" +
                        "repaires d'iniquités, je les évite donc.\n" +
                        "Il se lève, la pipe toujours fermement coincée entre ses dents.\n" +
                        "— Vous mangeriez bien un peu de ragoût, je parie. Les jeunes de votre âge ont toujours\n" +
                        "faim.\n" +
                        "—Non, sincèrement... dites-vous poliment, bien qu'en vérité vous vous sentiez un petit\n" +
                        "creux.\n" +
                        "—C'est bien ce que je pensais, dit le Vieux du Pays. Je vais vous en donner un bol\n" +
                        "maintenant et un bol à emporter, si vous avez de quoi le transporter. Il contient de la\n" +
                        "feuille de laurier et de l'armoise, et il guérira tous les maux dont vous souffrez.\n" +
                        "Un ragoût curatif ? demandez-vous en regardant la marmite noire posée sur le feu.\n" +
                        "— Oui da, et n'ayez pas l'air aussi surpris. Vous ne connaissez pas le vieux proverbe :\n" +
                        "Si la maladie te ronge,\n" +
                        "Qu'elle s'aggrave et se prolonge,\n" +
                        "Prends donc, il n 'est rien de mieux,\n" +
                        "Un bol de ragoût des Vieux.\n" +
                        "— Eh bien, non, avouez-vous. Je ne le connaissais pas du tout.\n" +
                        "Maintenant vous le connaissez, dit-il d'un ton abrupt. Un bol suffit pour guérir\n" +
                        "n'importe quelle maladie, n'importe quelle blessure. Vous sentirez les points de vie\n" +
                        "circuler en vous comme la sève au printemps. Et, se servant d'une louche accrochée à\n" +
                        "un clou près de la cheminée, il vous remplit un bol. Lequel bol va vous restituer\n" +
                        "naturellement la totalité de vos points de vie si, par hasard, vous en avez perdu, et\n" +
                        "guérir toute maladie que vous auriez pu contracter durant votre aventure. De plus, si\n" +
                        "vous avez eu la bonne idée d'emporter des ustensiles de cuisine, vous pouvez prendre\n" +
                        "avec vous un bol de ragoût que vous avalerez plus tard si vous perdez d'autres points\n" +
                        "de vie. (Mais il faut que vous ayez des ustensiles de cuisine, car le ragoût du Vieux\n" +
                        "n'opère que s'il est consommé chaud.) Pour l'instant, retournez à la carte du village et\n" +
                        "continuez votre exploration.\n");

        chapter63.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter64 = new Chapter("64", "",
                "64\n" +
                        "I1 s'est levé ! Le brouillard s'est levé ! Qu'est-ce que vous en dites : votre fameux sens\n" +
                        "de l'orientation n' était pas si mauvais après tout ! Maintenant rendez-vous au 58\n");

        chapter64.addChoice(new Choice("Page 58", "58"));

        Chapter chapter65 = new Chapter("65", "",
                "65\n" +
                        "Vous avez parcouru, non sans peine, des kilomètres en direction du nord-est, pour\n" +
                        "arriver là. Et maintenant que vous y êtes, vous vous demandez peut-être pourquoi vous\n" +
                        "vous êtes donné tout ce mal. Les verdoyantes prairies et les champs fertiles d'Avalon\n" +
                        "ont peu à peu cédé la place à un pays plus rude, plus sauvage et vous êtes maintenant à\n" +
                        "l'orée d'un bois sombre. menaçant. Ce qui vous frappe le plus, c'est un silence\n" +
                        "oppressant. En général, les oiseaux gazouillent sans fin dans les bois, et de petits\n" +
                        "animaux se faufilent dans les taillis. Mais ici, rien ne bouge, et le seul bruit que vous\n" +
                        "perceviez, ce sont les battements precipités de votre cœur. Allez-vous avancer dans le\n" +
                        "bois, Pip ?\n" +
                        "si vous décidez de ne pas entrer dans le bois, et de revenir sur vos pas, consultez la\n" +
                        "carte que vous a donnée Merlin, et choisissez une nouvelle direction en commençant à\n" +
                        "l'endroit marqué d'un X. Si vous décidez de prendre le risque de vous aventurer dans\n" +
                        "le bois, rendez-vous au 5.\n");

        chapter65.addChoice(new Choice("Carte de Merlin", "4"));
        chapter65.addChoice(new Choice("Page 5", "5"));

        Chapter chapter66 = new Chapter("66", "",
                "66\n" +
                        "Rendez-vous directement au 41.\n");

        chapter66.addChoice(new Choice("Page 41", "41"));

        Chapter chapter67 = new Chapter("67", "",
                "67\n" +
                        "— Soyez le bienvenu, déclare le Monstre, qui a manifestement remarqué que vous\n" +
                        "vous transformiez petit à petit en pierre. Nous avons réservé un emplacement de choix\n" +
                        "où nous vous placerons dés que vous serez complètement pétrifié. Là-bas vers le sud,\n" +
                        "où vous aurez bien chaud. Vous n'allez pas supporter ça, n'est-ce pas ? Par un suprême\n" +
                        "effort de volonté, vous dégainez votre épée et vous la brandissez .Vous allez vous\n" +
                        "battre pour vous tirer de là, même si vous devez y laisser la vie. Le Monstre de Pierre\n" +
                        "ne dispose pas de tellement de POINTS DE VIE puisqu'il est déjà à moitié mort : 18\n" +
                        "seulement pour être exact. Et il a besoin de sortir un 7, ou plus, pour réussir à vous\n" +
                        "frapper. De plus, vos efforts démesurés vous ont donné droit au premier coup. En\n" +
                        "revanche, vous êtes plus ou moins à moitié mort vous aussi, vous n'êtes donc pas dans\n" +
                        "de bonnes conditions pour vous battre. Il vous faut sortir un 8 ou davantage pour\n" +
                        "frapper durant ce combat et, comme le Monstre est en pierre, vous devez déduire 1\n" +
                        "point de tous les Points de Dommage que vous lui infligerez. Mais enfin, la chance\n" +
                        "peut vous sourire.\n" +
                        "Si le Monstre vous tue, rendez-vous au 14. Si vous réussissez à tuer le Monstre, vous\n" +
                        "pouvez vous traîner hors du jardin de pierre et, à ce moment-là, la paralysie qui vous\n" +
                        "envahissait petit à petit se dissipera. Reprenez votre carte et explorez une partie du\n" +
                        "village moins dangereuse.\n");

        chapter67.addChoice(new Choice("Page 14", "14"));
        chapter67.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter68 = new Chapter("68", "",
                "68\n" +
                        "Glou ... glou ... glou ... glou... ce sont les sons que vous émettez en vous noyant, Pip...\n" +
                        "Ce corps stupide ne savait pas nager ! Rendez-vous au 14.\n");

        chapter68.addChoice(new Choice("Page 14", "14"));

        Chapter chapter69 = new Chapter("69", "",
                "69\n" +
                        "Rendez-vous directement au 41.\n");

        chapter69.addChoice(new Choice("Page 41", "41"));       

        Chapter chapter70 = new Chapter("70", "",
                "70\n" +
                        "La chance vous sourit, Pip. Vous trébuchez en reculant jusqu'à ce que vos pieds\n" +
                        "atteignent la limite du jardin de pierre. Aussitôt le Monstre se fige sur place, alors que\n" +
                        "vous-même, en revanche, cessez de vous transformer en pierre. Vous l'avez échappe\n" +
                        "belle ! Reprenez votre carte et explorez une partie moins dangereuse du village.\n");

        chapter70.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter71 = new Chapter("71", "",
                "71\n" +
                        "Félicitations ! Vous avez trouvé un fer à cheval Maintenant ne perdez plus de temps.\n" +
                        "Reprenez la carte pour explorer une partie plus intéressante du village\n");

        chapter71.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter72 = new Chapter("72", "",
                "72\n" +
                        "C'est un bloc de pierre ! De pierre massive. Cette chaumière n'est pas du tout une\n" +
                        "chaumière : c'est une énorme masse de pierre taillée en forme de chaumière et\n" +
                        "recouverte d'un toit de chaume ! Une curiosité ! Reportez-vous à votre carte et\n" +
                        "explorez une autre partie du village.\n");

        chapter72.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter73 = new Chapter("73", "",
                "73\n" +
                        "Voilà qui est un peu mieux, Pip. Guère mieux, mais quand même. Les arbres semblent\n" +
                        "un peu moins denses par ici... Allons bon, voilà que vous tombez sur un Troll. Quel\n" +
                        "vilain petit bonhomme, en plus. Les bois en sont pleins à cette époque de l'année, cela\n" +
                        "n'a donc rien de bien surprenant, mais cela n'en est pas moins fâcheux, les Trolls étant\n" +
                        "ce qu'ils sont. Les Trolls des Bois en tout cas. Ils sont parfaitement immunisés au\n" +
                        "métal, il est donc inutile de les attaquer avec votre épée ou d'autres armes. (« Parfaite-\n" +
                        "ment inutile », marmonne E.J.) Mais si vous ne l'at taquez pas, il va vous dépouiller de\n" +
                        "tous vos biens. Il vous volera tout ce que vous possédez, (sauf l'armure et les armes) si\n" +
                        "vous n'intervenez pas rapidement. En fait, vous n'avez le choix qu'entre trois solutions.\n" +
                        "Vous pouvez le noyer dans votre gourde à eau. (Vous en avez bien emporté une, n'est-\n" +
                        "ce pas ?) L'eau prendra par la suite un goût bizarre mais c'est à prévoir. Ou alors, si\n" +
                        "vous n'avez pas emporté de gourde, vous pouvez l'assommer d'un coup sur la tete avec\n" +
                        "vos bottes de rechange. (Vous avez bien emporté des bottes de rechange, n'est-ce pas\n" +
                        "?) Ou si vous n'avez emporté ni gourde à eau ni bottes de rechange, vous pouvez\n" +
                        "l'ensorceler en jouant du luth ou de la harpe. (Vous avez bien emporté un luth et une\n" +
                        "harpe, n'est-ce pas ?)\n" +
                        "Si vous ne possédez pas le matériel nécessaire pour neutraliser le Troll des Bois, vous\n" +
                        "ne possédez plus que vos armes et votre armure. Mettez à jour votre Feuille\n" +
                        "d'Aventure. Dans tous les cas, rendez-vous au 11\n");

        chapter73.addChoice(new Choice("Page 11", "11"));

        Chapter chapter74 = new Chapter("74", "",
                "74\n" +
                        "Rendez-vous directement au 41.\n");

        chapter74.addChoice(new Choice("Page 41", "41"));

        Chapter chapter75 = new Chapter("75", "",
                "75\n" +
                        "— Soyez le bienvenu, dit le Monstre de Pierre. Mais vous ne répondez pas. Non pas\n" +
                        "par stoïcisme Devant le danger. Vous ne répondez pas, parce que TOUS en êtes\n" +
                        "incapable ! Vous êtes complètement pétrifié ». Rendez-vous au 14.\n");

        chapter75.addChoice(new Choice("Page 14", "14"));

        Chapter chapter76 = new Chapter("76", "",
                "76\n" +
                        "Vous avez fait un tiers du chemin...\n" +
                        "Vous avez fait la moitié du chemin...\n" +
                        "Vos muscles sont maintenant crispés et douloureux\n" +
                        "après tous les efforts que vous avez fournis. Vous avez les jambes en plomb. Vos\n" +
                        "doigts, engourdis par le froid de la rivière, vous refusent tout usage. Vous lâchez prise,\n" +
                        "Pip. Vous lâchez prise !\n" +
                        "Vous tombez ... tombez ... tombez... Vous tombez jusqu'au 14.\n");

        chapter76.addChoice(new Choice("Page 14", "14"));

        Chapter chapter77 = new Chapter("77", "",
                "77\n" +
                        "Bien jugé, Pip. Rendez-vous au 21.\n");

        chapter77.addChoice(new Choice("Page 21", "21"));

        Chapter chapter78 = new Chapter("78", "",
                "78\n" +
                        "La chance vous sourit, Pip. Ce corps-là nage comme un poisson, comme une otarie !\n" +
                        "Les remous glacés vous malmènent, vous submergent, vous projettent contre des\n" +
                        "rochers invisibles... mais vous continuez à nager ! Le courant vous ramène en arrière,\n" +
                        "vous entraîne en avant... mais vous nagez. Votre adresse et votre détermination —\n" +
                        "sans parler de vos muscles endurcis par toutes vos aventures — vous assurent la\n" +
                        "victoire. Vous arrivez de l'autre côté sain et sauf.\n" +
                        "Maintenant il ne reste plus qu'un petit problème : la paroi verticale de la falaise qui se\n" +
                        "dresse devant vous... C'est le moment de sortir votre matériel d'escalade et de lancer\n" +
                        "deux dés, Pip. Voyons si vous allez réussir à franchir le dernier obstacle.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 9 : rendez-vous au 85.\n" +
                        "de 10 à 12 : rendez-vous au 76.\n");

        chapter78.addChoice(new Choice("Page 85", "85"));
        chapter78.addChoice(new Choice("Page 76", "76"));

        Chapter chapter79 = new Chapter("79", "",
                "79\n" +
                        "Rendez-vous directement au 41.\n");

        chapter79.addChoice(new Choice("Page 41", "41"));

        Chapter chapter80 = new Chapter("80", "",
                "80\n" +
                        "Un peu de persévérance peut vous mener loin. Vous avez repéré une ouverture. Pas\n" +
                        "une porte, juste une ouverture, la porte elle-même a disparu depuis longtemps. Mais\n" +
                        "l'ouverture donne accès à la tour et ruine. Vous tirez votre épée et vous avancez avec\n" +
                        "prudence, tous les sens en éveil, guettant le moindre danger. Pas un bruit ; rien. Vous\n" +
                        "entrez. Une pénombre sinistre règne parmi ces ruines, et il faut un certain temps à vos\n" +
                        "yeux pour s'accommoder. Mais vous constatez bientôt que l'intérieur de la tour est en\n" +
                        "pire état encore que l'extérieur. Des pierres descellées et des tas de gravats jonchent le\n" +
                        "sol. On aperçoit encore les restes d'un escalier en spirale, mais qui ne monte plus très\n" +
                        "haut. Vous voyez l'endroit où il s'est écroulé, à cinq mètres au-dessus de votre tête.\n" +
                        "Vous songez un instant à ressortir, mais étant venu jusque-là, vous décidez d'explorer\n" +
                        "un peu plus avant. Votre épée à la main, vous commencez à circuler avec précautions\n" +
                        "parmi les débris... Une fois de plus, votre persévérance est récompensée ! Vous\n" +
                        "repérez, à moitié dissimulée par les gravats, une trappe en bois pourrissant, cerclée de\n" +
                        "fer rouillé. Un anneau de fer permet de la soulever. Vous saisissez l'anneau d'une\n" +
                        "main ferme et vous tirez. L'anneau vous reste dans la main, mais peu importe : le bois\n" +
                        "est tellement décomposé, le fer tellement rouillé que la trappe tout entière s'effrite et\n" +
                        "votre regard plonge dans une fosse profonde et noire. Trop noire pour que vous\n" +
                        "puissiez voir quoi que ce soit. Rapidement, vous allumez une torche. A sa lumière\n" +
                        "vacillante, vous distinguez des marches de pierre, très raides, qui s'enfoncent dans\n" +
                        "l'obscurité. Une fois de plus vous hésitez, vous demandant si vous ne feriez pas mieux\n" +
                        "de retourner à la lumière du soleil. Mais que trouverez-vous dans le village ? n êtes-\n" +
                        "vous pas Pip, le Pourfendeur de Dragons ? Enfin, Pip le Futur Pourfendeur de\n" +
                        "Dragons, plutôt, courageusement, vous posez le pied sur la première marche.\n" +
                        "Courageusement, vous glissez et vous dévalez l'escalier. Courageusement vous vous\n" +
                        "époussetez une fois arrivé en bas, indemne heureusement. Vous vous trouvez dans un\n" +
                        "couloir souterrain, sombre, humide, sans lumière. Allez-vous le suivre? Oui, bien sûr\n" +
                        "! Cela va de soi, non ?\n" +
                        "Si vous ne désirez pas suivre le couloir, retournez à votre carte et explorez une autre\n" +
                        "partie du village. Si vous vous engagez dans le couloir, rendez-vous au 25.\n");

        chapter80.addChoice(new Choice("Carte du Village", "10"));
        chapter80.addChoice(new Choice("Page 25", "25"));

        Chapter chapter81 = new Chapter("81", "",
                "81\n" +
                        "C est un refuge magique, Pip. Un endroit merveilleux en plus, bien qu'il soit\n" +
                        "impossible à décrire disons simplement qu'une lumière bleue y brille à profusion.\n" +
                        "Baignez-vous dans cette lumière, puis retournez au paragraphe que vous venez de\n" +
                        "quitter, ayant récupéré tous vos POINTS DE VIE.\n");

        chapter81.addChoice(new Choice("Page 35", "35"));
        chapter81.addChoice(new Choice("Page 27", "27"));

        Chapter chapter82 = new Chapter("82", "",
                "82\n" +
                        "Quel est ce bruit ? Quelqu'un siffle, juste derrière cet arbre. Peut-être sait-il comment\n" +
                        "sortir de ce bois stupide. Vivement, vous plongez dans les taillis, et vous rampez en\n" +
                        "direction du sifflement. Vous parvenez au pied d'un arbre, et vous vous redressez à\n" +
                        "l'abri de son tronc. Sapristi, c'est un Loup ! Ce sifflement était celui d'un Loup !\n" +
                        "Essayez d'obtenir de lui une Réaction Amicale, vite ! Si vous échouez, dégainez E.J.,\n" +
                        "(« Se battre si rapidement ? marmonne E.J., tu ne peux pas me laisser un peu en paix\n" +
                        "? ») et, à l'attaque !\n" +
                        "Le Loup Siffleur possède 15 POINTS DE VIE, mais ses dents sont émoussées. Il ne\n" +
                        "vous infligera donc pas plus de Points de Dommage que ceux indiqués par les dés.\n" +
                        "Si vous gagnez le combat, ou si vous avez obtenu une Réaction Amicale, rendez-vous\n" +
                        "au 11. Sinon vous êtes bon pour le redoutable (et redouté) 14.\n");

        chapter82.addChoice(new Choice("Page 11", "11"));
        chapter82.addChoice(new Choice("Page 14", "14"));

        Chapter chapter83 = new Chapter("83", "",
                "83\n" +
                        "Rendez-vous immédiatement au 41.\n");

        chapter83.addChoice(new Choice("Page 41", "41"));

        Chapter chapter84 = new Chapter("84", "",
                "84\n" +
                        "Une odeur de soufre enflammé, à laquelle se mêle bientôt la puanteur caractéristique\n" +
                        "du méthane, empoisonne l'atmosphère. Il semble que vous brûliez, Pip, et ça n'a rien à\n" +
                        "voir avec la chaleur. Le sentier que vous suivez aboutit à la gueule béante d'une\n" +
                        "gigantesque caverne. Sans vouloir trop insister, vous semblez bien avoir trouvé...\n" +
                        "l'ANTRE DU DRAGON ! ! ! Vous n'avez plus envie de retourner chez vous\n" +
                        "maintenant, n'est-ce pas ? Préparez-vous au combat, et rendez-vous au 95.\n");

        chapter84.addChoice(new Choice("Page 95", "95"));

        Chapter chapter85 = new Chapter("85", "",
                "85\n" +
                        "Vous avez réussi ! Après toutes ces épreuves, vous avez réussi ! Vous avez franchi\n" +
                        "l'abîme, sain et sauf. Rendez-vous au 16.\n");

        chapter85.addChoice(new Choice("Page 16", "16"));

        Chapter chapter86 = new Chapter("86", "",
                "86\n" +
                        "— Non! Non! glapit E.J., paniquée, quand vous avancez d'un pas. J'ai un affreux\n" +
                        "pressentiment ! Une terrible intuition ! J'ai... Mais la stupeur lui coupe la parole.\n" +
                        "Le passage secret vous a amené dans une vaste caverne souterraine, grande comme\n" +
                        "une cathédrale et taillée (à en juger par les murs) par la main de l'homme directement\n" +
                        "dans le socle rocheux en dessous du village de Pierre-qui-Mue. La caverne est\n" +
                        "illuminée par des cristaux étincelants sertis dans les parois et dans les colonnes de\n" +
                        "pierre naturelle qui supportent la voûte. Et sous cette voûte, montant du sol de pierre,\n" +
                        "s'épanouissent des fleurs, des buissons, des champignons de cristal, de toutes les\n" +
                        "tailles, formes et couleurs possibles, tous translucides ou transparents, reflétant la\n" +
                        "lumière, brillant de mille feux, transformant le décor en une véritable féérie. Et peut-\n" +
                        "être se trouve-t-on vraiment au Pays des Fées, à en juger par les petites créatures ailées\n" +
                        "qui volètent parmi les fleurs. Vous vous immobilisez, le souffle coupé par ce\n" +
                        "spectacle. Les petites créatures ailées (se pourrait-il que ce soient vraiment des Fées ?)\n" +
                        "ne vous prêtent aucune attention. Mais il y a une autre créature dans cette caverne, plus\n" +
                        "grande et beaucoup plus majestueuse. Un être mince, de haute taille, avec une peau\n" +
                        "d'argent et de grands yeux dorés. Ces yeux se fixent sur vous à l'instant même oû vous\n" +
                        "entrez. A votre côté, vous sentez E.J. qui se met à vibrer.\n" +
                        "La créature — l'être le plus beau peut-être que vous ayez jamais vu — se dirige vers\n" +
                        "vous, s'arrêtant à moins de dix mètres. Ses yeux dorés semblent vous fixer jusqu'au\n" +
                        "fond de l'âme. Elle prend la parole.\n" +
                        "Les mortels qui pénètrent ici sont souvent obligés d'y rester à jamais.\n" +
                        "Je te l'avais dit ! chuchote E.J. d'une voix sifflante. Cette fois, tu as réussi !\n" +
                        "Mais la créature continue à parler, et sa voix mélodieuse résonne dans votre esprit.\n" +
                        "Mais je sens que ton âme est pure et qu'une tâche urgente t'attend. Par conséquent, tu\n" +
                        "peux prendre ce que tu cherches et repartir en paix. Et elle se détourne pour\n" +
                        "s'éloigner.\n" +
                        "Ce que vous cherchez ? Mais vous ne savez même pas ce que vous cherchez !\n" +
                        "Excusez-moi, lancez-vous. Excusez moi... monsieur. La royale créature se retourne et\n" +
                        "attend. Je crains de ne pas savoir du tout où je me trouve, balbutiez-vous.\n" +
                        "Tu es parvenu à l'entrée du Royaume du Sidhe. Ton destin , je le vois, va peut-être\n" +
                        "t'entraîner un jour à t'y aventurer. Mais, pour le moment, tu ne peux pas aller au-delà\n" +
                        "de cette caverne.\n" +
                        "Tout cela ne signifie pas grand-chose. Mais vous enchaînez précipitamment :\n" +
                        "En réalité, je ne cherche rien, vous savez. Je suis tombé par hasard sur ce passage et\n" +
                        "j'étais intrigué. Puis, une soudaine inspiration vous pousse à ajouter : Mon épée m'a\n" +
                        "dit de venir ici.\n" +
                        "La créature sourit.\n" +
                        "Peut-être bien. Et puisque tu ne veux rien, la coutume de ma race veut que nous te\n" +
                        "donnions quelque chose. Donne-moi ton épée, je te prie.\n" +
                        "Non ! hurle E.J. qui, prise de faiblesse, s'évanouit et sombre dans le silence. Poussé par\n" +
                        "une force inconnue, vous tendez E.J. à la créature d'argent qui pasàe rapidement la\n" +
                        "main sur la lame. Puis, elle vous rend votre épée.\n" +
                        "Quand ton épée s'éveillera, elle sera légèrement différente. Dorénavant, elle infligera\n" +
                        "10 Points de Dommage supplémentaires aux Dragons, quand tu les combattras. Va,\n" +
                        "maintenant.\n" +
                        "Et cette fois, lorsque la créature d'argent se détourne, les cristaux perdent peu à peu de\n" +
                        "leur éclat. Vous vous hâtez de repartir par le passage secret. Quelle histoire ! Respirez\n" +
                        "profondément pour vous calmer, et reprenez la carte du village. Mais n'oubliez pas :\n" +
                        "E.J. infligera 10 Points de Dommage supplémentaires aux Dragons, quand vous les\n" +
                        "combattrez.\n");

        chapter86.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter87 = new Chapter("87", "",
                "87\n" +
                        "Voilà un Fantôme qui est bel et bien mort ! D'ici que cette aventure soit terminée, tout\n" +
                        "le monde vous appellera Pip le Pourfendeur de Fantômes. Si vous n'êtes pas\n" +
                        "surnommé, bien entendu, Pip le Pourfendeur de Dragons. Peut-être même secouera-t-\n" +
                        "on la tête en disant : « Ce pauvre vieux Pip. Il s'est bien défendu, mais les monstres ont\n" +
                        "fini par en venir à bout. » Mais en voilà assez. Il faut fouiller cette église. Et vous y\n" +
                        "allez de bon cœur, mais il n'y a pas la moindre pièce de bronze, d'argent ou d'or à trou-\n" +
                        "ver, même dans le tronc. Le Fantôme, néanmoins, porte un anneau au doigt, et vous le\n" +
                        "lui enlevez avec des gestes prudents pour le glisser à votre propre doigt. Il émet un\n" +
                        "tintement quand vous le manipulez. Un tintement ! Serait-ce un anneau magique ?\n" +
                        "Vous n'avez aucun moyen de le vérifier. Réjouissez- vous simplement de le posséder\n" +
                        "et espérez qu'il vous sera utile par la suite. (Cela vaudrait mieux, à vrai dire car vous\n" +
                        "ne pouvez plus le retirer de votre doigt.) Continuez votre chemin, Pip ! Continuez !\n" +
                        "retournez à votre carte, et explorez une autre partie du village.\n");

        chapter87.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter88 = new Chapter("88", "",
                "88\n" +
                        "Vous avez repéré une porte béante, morbleu ! Vous franchissez la porte, morbleu ! Un\n" +
                        "effondrement se produit et vous êtes enterré sous les décombres, morbleu ! Rendez-\n" +
                        "vous au 14.\n");

        chapter88.addChoice(new Choice("Page 14", "14"));

        Chapter chapter89 = new Chapter("89", "",
                "89\n" +
                        "Rendez-vous directement au 41.\n");

        chapter89.addChoice(new Choice("Page 41", "41"));

        Chapter chapter90 = new Chapter("90", "",
                "90\n" +
                        "il était évident que vous alliez prendre ce risque. Le passage tournicote dans tous les\n" +
                        "sens. Comme il est trés étroit et bas de plafond, vous êtes la plupart du temps plié en\n" +
                        "deux et vos coudes raclent les parois. Vous finissez par atteindre une impasse, où vous\n" +
                        "butez contre un mur nu. Ce passage ne peut pas se terminer ainsi ! Non, bien sûr, c'est\n" +
                        "impossible. Vous tàtonnez contre le mur jusqu'à ce que vous trouviez à nouveau un\n" +
                        "drôle de petit bouton et, quand vous le tournez, le mur tout entier pivote dans un long\n" +
                        "grincement. (N'est-ce pas excitant ?) Vous vous apprêtez à avancer quand E.J.\n" +
                        "chuchote :\n" +
                        "N'entre pas là-dedans ! Vous hésitez.\n" +
                        "Pourquoi pas ? chuchotez-vous à votre tour.\n" +
                        "J'ai vécu plus d'aventures que toi, reprend EJ sentencieuse. Il se passe toujours quelque\n" +
                        "chose de désagréable quand on émerge d'un passage secret Toujours. C'est une sorte de\n" +
                        "Loi de la Nature, comme la pesanteur ou l'excès inexplicable de pièce détachées quand\n" +
                        "vous démontez et remontez une pendule. N'entre pas là-dedans, ou tu vas te retrouvez\n" +
                        "au 14, c'est tout vu.\n" +
                        "Mais qu'est-ce que je dois faire alors ? demandez- vous.\n" +
                        "Retourne à ta carte et explore une autre partie du village. Une partie moins dangereuse,\n" +
                        "insiste E.J d'un ton pressant.\n" +
                        "Alors, qu'allez-vous faire ? Retourner à la carte du village? Si vous décidez de\n" +
                        "négliger les conseils d'E.J., vous sortez du passage. Rendez-vous au 86.\n");

        chapter90.addChoice(new Choice("Carte du Village", "10"));
        chapter90.addChoice(new Choice("Page 86", "86"));

        Chapter chapter91 = new Chapter("91", "",
                "91\n" +
                        "Quel hideux cadavre va sortir de la tombe béante ? Quel monstre en décomposition ?\n" +
                        "Quel cruel vampire ? Quelle goule spectrale ?\n" +
                        "Ohé, mon gars... donne-moi un coup de main ! Qui vous interpelle ? Est-ce un cadavre\n" +
                        "tout récent, ou le Fossoyeur ?\n" +
                        "Vous optez pour le Fossoyeur, et comme il semble être la première personne\n" +
                        "relativement normale que vous rencontriez dans le village de Pierre-qui-Mue (à part,\n" +
                        "s'entend, qu'il s'extirpe en rampant d'une tombe), vous décidez de lui donner en effet\n" +
                        "un coup de main. Et le voilà qui apparaît, barbu, corpulent, le teint fleuri, avec une\n" +
                        "allure de matelot, sans parler du parfum de rhum que dégage son haleine, ce qui\n" +
                        "expliquerait peut-être comment il en est arrivé à tomber dans une tombe ouverte.\n" +
                        "Grand merci, mon brave petit gars. Un homme dans ma condition a du mal à\n" +
                        "ressortir d'une tombe. Je me présente Cedric, à ton service. Long John cedric on\n" +
                        "m'appelle, parce que j'ai beaucoup navigué. Ancien commandant. Ancien pirate.\n" +
                        "Maintenantt à la retraite, et employé comme fossoyeur.\n" +
                        "Je m'appelle Pip, dites-vous, vous demandant s'il n' est pas fou.\n" +
                        "Entendu parler dans le temps d'un Pip qu'a rectifié le sorcier Ansalom. Ça ne peut pas\n" +
                        "être toi, des fois ? Et avant que vous n'ayez eu le temps de répondre, il poursuit : Mais\n" +
                        "non, je me disais bien. Enfin, n'importe, si t'as débarqué par hasard à la Pierre-qui-\n" +
                        "Mue, tu dois bien te demander ce qui cloche ici. Eh bien, je vais te le dire, moi,\n" +
                        "puisque tu m'as gentiment aidé à sortir de la tombe. C'est un endroit maudit, oui, mon\n" +
                        "petit. Le village tout entier, sauf moi. Deux maisons transformées en blocs de pierre.\n" +
                        "le banquier du coin a été transformé en Gnome. Le vicaire est un Fantôme\n" +
                        "maintenant. Tous les chevaux se sont défilés. Tous les habitants, quasiment, ont été\n" +
                        "changés en Monstres de Pierre, pétrifiés, comme dit l'autre. Et des drôles de zigotos\n" +
                        "sont venus s'installer dans le coin. Je me serais trouvé dans de sales draps sans le rhum\n" +
                        "pour me protéger. Un gars bourré de rhum, c'est pas facile à maudire. du moins, c'est\n" +
                        "mon idée. Il a le regard vitreux, comme si le seul fait de parler de rhum avait suffi à\n" +
                        "remettre l'alcool en circulation dans ses veines.\n" +
                        "Qui a maudit le village ? demandez-vous, tout excité. Mais déjà il s'effondre,\n" +
                        "complètement ivre. En glissant à terre et en rebasculant lentement dans a tombe\n" +
                        "béante, il marmonne un mot : Dragons...\n" +
                        "Des Dragons ! hurlez-vous. Comment ça, des Dragons ?\n" +
                        "Mais pour toute réponse, vous n'entendez plus qu'un ronflement. Mieux vaut retourner\n" +
                        "à votre carte et explorer plus avant le village ; vous n'obtiendrez rien d'autre ici.\n");

        chapter91.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter92 = new Chapter("92", "",
                "92\n" +
                        "Vous franchissez la porte, pour émerger dans le brouillard. Aussitôt, vous faites volte-\n" +
                        "face, mais bien que vous ayez réagi à la vitesse de l'éclair, il est déjà trop tard. La\n" +
                        "porte a disparu. Vous tâtonnez sans succès dans le brouillard. Vous tâtonnez pendant\n" +
                        "très, très longtemps. Rendez-vous au 8.\n");

        chapter92.addChoice(new Choice("Page 8", "8"));

        Chapter chapter93 = new Chapter("93", "",
                "93\n" +
                        "Et si c'était un Gnome de Zurich ? Vous n'imaginez pas le nombre de fois où il a\n" +
                        "compté et recompté votre argent avant de le ranger avec soin dans une bourse en cuir\n" +
                        "fermée d'une serrure. Vous vous rendez compte ! Une bourse avec une serrure ! Mais\n" +
                        "il semble décidé à vous en donner pour votre argent, ce qui est déjà bien. Il vous\n" +
                        "explique que vous pouvez en effet trouver le chemin pour arriver à l'Antre du Dragon\n" +
                        "depuis le village de la Pierre-qui- Mue ; il précise également que ce n'est pas très loin.\n" +
                        "Il vous suffit de vous rendre à la tour en ruine au 30 et d'y chercher une trappe qui\n" +
                        "donne accès à un tunnel, conduisant à son tour au sentier qui vous amènera à l'Antre\n" +
                        "du Dragon. Au comble de l'excitation, vous voulez vous ruer sur-le-champ à la tour en\n" +
                        "ruine. Mais d'un geste, le Gnome vous arrête.\n" +
                        "— Un petit conseil dit-il, et gratuit en plus. Il serait peut-être plus sûr de ne pas vous\n" +
                        "rendre à l'Antre du Dragon avant d'avoir exploré à fond le village de la Pierre-qui-\n" +
                        "Mue. C'est un endroit dangereux, je ne le sais que trop, mais quelque part y sont\n" +
                        "cachés un ou deux objets qui pourraient faire toute la différence entre la vie et la mort\n" +
                        "quand vous pénétrerez dans l\" Antre. Votre vie et votre mort, s'entend.\n" +
                        "Mais quels sont ces objets et où vais-je les trouver ? vous exclamez-vous. Le Gnome\n" +
                        "secoue sa tête de gnome.\n" +
                        "Le roi Arthur lui-même ne posséderait pas suffisamment d'or dans le Trésor Royal\n" +
                        "pour payer ce genre de renseignements. Et après vous avoir salué poliment, il disparaît\n" +
                        "à l'intérieur de la chaumière, refermant la porte derrière lui.\n" +
                        "Lorsque vous tentez de le suivre (ce qui va de soi), vOUS constatez que la porte, qui\n" +
                        "semblait en bois, est faite en réalité de quelque métal d'une grande rareté, et que les\n" +
                        "fenêtres sont garnies de vitres en verre magiquement renforcé et tout à fait incassable.\n" +
                        "La chaumière est aussi impénétrable qu'une chambre forte. Et comme le Gnome refuse\n" +
                        "de ressortir, il ne vous reste plus qu'à consulter de nouveau la carte du village de la\n" +
                        "Pierre-qui-Mue, et à prendre une décision : pousser plus avant votre exploration pour\n" +
                        "essayer de découvrir les objets dont il vous a parlé, ou bien vous rendre\n" +
                        "immédiatement à la tour en ruine.\n");

        chapter93.addChoice(new Choice("Carte du Village", "10"));
        chapter93.addChoice(new Choice("La tour - Page 30", "30"));

        Chapter chapter94 = new Chapter("94", "",
                "94\n" +
                        "Avant que le roi Arthur n'ait chassé les Romains, un dicton courait dans le royaume\n" +
                        "d'Avalon (qui, à cette époque, ne s'appelait pas, bien entendu, Avalon), qui disait : «\n" +
                        "Au Vainqueur, les Dépouilles. » Ad victor spoilarum, ou une autre absurdité de ce\n" +
                        "genre en latin.) Voilà un dicton qui s'applique parfaitement à vous, maintenant, car\n" +
                        "vous avez sans aucun doute remporté une victoire en sabrant ces Moines macabres.\n" +
                        "Alors, ne perdez pas un instant de plus : entrez dans l'abbaye, et fouillez, fouillez,\n" +
                        "fouillez ! Lancez deux dés pour savoir ce que vous avez découvert. Si toutefois vous\n" +
                        "avez découvert quelque chose.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 4 : rendez-vous au 115.\n" +
                        "de 5 à 8 : rendez-vous au 119.\n" +
                        "de 9 à 12 : rendez-vous au 106.\n");

        chapter94.addChoice(new Choice("Page 115", "115"));
        chapter94.addChoice(new Choice("Page 119", "119"));
        chapter94.addChoice(new Choice("Page 106", "106"));

        Chapter chapter95 = new Chapter("95", "",
                "95\n" +
                        "Derrière vous, le désert volcanique. Devant vous, la gueule béante d'une sombre et\n" +
                        "sinistre caverne. Dans vos narines, l'odeur du Dragon, mêlée à des relents de vapeurs\n" +
                        "sulfureuses et de méthane. A votre main (si vous avez le moindre bon sens) votre\n" +
                        "fidèle épée. Dans votre esprit, la liste de vos sortileges.\n" +
                        "Vous touchez au but, Pip. Voilà l'endroit que vous recherchez depuis si longtemps,\n" +
                        "risquant votre vie pour le trouver. S'il y avait des trompettes ici, elles lanceraient vers\n" +
                        "les cieux une triomphante fanfare. mieux vaut, d'ailleurs, qu'il n'en soit rien, car s'il y a\n" +
                        "vraiment une chose dont vous n'avez pas besoin, c est d'une ruée sauvage de Dragons,\n" +
                        "en bronze ou pas, alertés par un brusque appel de trompettes. Vous avancez à pas\n" +
                        "précautionneux, tous les sens en alerte, le cœur battant. Des questions déferlent malgré\n" +
                        "vous dans votre esprit. Le Dragon de Bronze est-il vraiment caché ici ? Merlin en\n" +
                        "semble persuadé, mais il peut se tromper. Combien d'autres Dragons allez-vous\n" +
                        "découvrir? Tout le monde à avalon sait que cette caverne est habitée par un grand\n" +
                        "nombre de monstres. Que peut recéler d'autre ce labyrinthe de tunnels souterrains, de\n" +
                        "passages, de grottes et de cavernes où vous vous apprêtez à entrer? La légende parle\n" +
                        "de créatures si horribles qu'elles peuvent vivre là sans être molestées par les cracheurs\n" +
                        "de feu, des créatures si terrifiantes que les Dragons eux-mêmes les laissent en paix. De\n" +
                        "quoi glacer le cœur du plus vaillant. C'est pourquoi, Pip, l'intrépidité avec laquelle\n" +
                        "vous avez avancé d'un pas ferme restera éternellement inscrite a votre actif. Rendez-\n" +
                        "vous au 108.\n");

        chapter95.addChoice(new Choice("Page 108", "108"));

        Chapter chapter96 = new Chapter("96", "",
                "96\n" +
                        "Non, bien sûr, ce n'est pas lui ! C'est un personnage dont vous vous souvenez, pour\n" +
                        "l'avoir rencontre dans le Château des Ténèbres du Sorcier Ansalom. Lors de votre\n" +
                        "dernière rencontre à la cour du roi Arthur, à Camelot, il arborait sa plus belle tenue et\n" +
                        "les insignes de son rang. Vous vous rappelez sa détermination lorsque, perdu dans les\n" +
                        "bois entourant le Château des Ténèbres, il était résolu à régler son compte au Sorcier,\n" +
                        "si jamais il parvenait a retrouver son chemin. Un homme digne de respect. comme tous\n" +
                        "les vrais rois. Et moins méchant qu'il pouvait le paraître.\n" +
                        "Roi Pellinore ? demandez-vous. Est-ce bien vous. Votre Majesté ?\n" +
                        "Quoi ? rétorque le personnage en armure noire. Quoi ? Quoi ? Quoi ? Mais, sapristi, je\n" +
                        "vous connais, non ? Le jeune Pip, l'audacieux aventurier, pas moins ! Je ne me trompe\n" +
                        "pas, quoi ?\n" +
                        "Oh, intrépide, je ne sais pas trop... répondez-vous modestement.\n" +
                        "Sottises ! On parle encore de votre dernier exploit dans tout le pays. Même les\n" +
                        "Ecossais sont au courant. Et vous savez comme ils sont longs à comprendre quoi que\n" +
                        "ce soit. Je ne serais pas surpris que la nouvelle parvienne jusqu'en Hibernia d'ici un an\n" +
                        "ou deux. Eh bien, Pip, qu'est-ce qui vous amène en ce lieu désolé ?\n" +
                        "Je suis à la recherche de l'Antre du Dragon, lui répondez-vous. J'ai suivi les indications\n" +
                        "d'une carte que m'a donnée Merlin et elles m'ont conduit ici.\n" +
                        "Je ne me fierais pas trop aux cartes de Merlin, fait remarquer Pellinore. Je me guidais\n" +
                        "justement sur une des siennes quand je me suis perdu en cherchant le Sorcier Ansalom.\n" +
                        "Vous ne sauriez pas, par hasard, où se trouve\n" +
                        "l'Antre du Dragon ? lui demandez-vous.\n" +
                        "Je crains que non, mon jeune ami. A dire vrai, j'ai eu tant de mal à dénicher le moyen\n" +
                        "de sortir d'ici que j ai\n" +
                        "réquisitionné cette demeure pour m'y installer pendant que je mettais au point un\n" +
                        "itinéraire. Mais Je suis quand même tombé sur un objet qui pourrait vous être utile. Et,\n" +
                        "du gantelet de son armure, il retire un rouleau de parchemin. C'est une description de\n" +
                        "l'Antre lui-même, qui pourrait vous rendre de précieux services. Si jamais vous en\n" +
                        "trouvez le chemin. Là-dessus, il vous tend le parchemin. Vous pouvez lire ce qui est\n" +
                        "écrit sur le parchemin en vOUS rendant au 101. Puis, vous reprenez votre carte du\n" +
                        "village de la Pierre-qui-Mue afin de poursuivre votre exploration\n");

        chapter96.addChoice(new Choice("Page 101", "101"));
        chapter96.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter97 = new Chapter("97", "",
                "97\n" +
                        "Ça va mieux maintenant, Pip? Espérons-le. Vous êtes jeune et robuste, doué d'un\n" +
                        "physique avantageux , mais vous semblez en plus immunisé contre ce genre de poison.\n" +
                        "Tout de même, veillez donc à ne pas vous bourrer de beignets, sinon vous allez vous\n" +
                        "empâter. Maintenant, reprenez votre carte et continuez à explorer le village de la\n" +
                        "Pierre-qui-Mue. Et cette fois, soyez plus prudent.\n");

        chapter97.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter98 = new Chapter("98", "",
                "98\n" +
                        "Le passage, une fissure naturelle dans le rocher, selon toute apparence, s'incurve,\n" +
                        "tourne, s'élargit, se rétrécit de nouveau et vous finissez par perdre tout sens de la\n" +
                        "direction. (Bien que vous ayez, en gros, la sensation d'aller vers le nord-ouest.) Le\n" +
                        "passage se resserre à tel point que vous êtes obligé de vous tourner de côté pour\n" +
                        "avancer. Vous franchissez les derniers mètres en vous aplatissant de votre mieux et\n" +
                        "vous émergez, tel un bouchon d'une bouteille, dans une autre caverne plus vaste que\n" +
                        "celle par laquelle vous êtes entré. Dans cette caverne vous remarquez vite un groupe\n" +
                        "de minuscules créatures humanoïdes à grosses têtes, qui s'avance vers vous. Elles sont\n" +
                        "armées d'épées, et revêtues d'armures en cuir. Vous êtes tombé, cela ne fait aucun\n" +
                        "doute pour vous, sur des Trolls des Rochers. Un deuxième passage permet de sortir de\n" +
                        "cette caverne en direction du nord, et il paraît un peu plus large que celui que vous\n" +
                        "venez d'emprunter. Mais, comment l'atteindre ?\n" +
                        "Votre sortilège INVISIBILITÉ peut opérer ici. Si vous l'utilisez avec succès, il vous\n" +
                        "sera possible de passer en catimini à côté des Trolls, puis de gagner le passage nord.\n" +
                        "Rendez-vous au 99. Mais n'oubliez pas que ce sortilège ne peut être utilisé qu'une\n" +
                        "seule fois, et que vous risquez d'en avoir besoin par la suite. Vous pouvez aussi\n" +
                        "adresser la parole aux Trolls, en espérant les convaincre de vous laisser passer.\n" +
                        "Rendez-vous, dans ce cas, au 103. Vous pouvez également bondir sur eux pour\n" +
                        "essayer de les mettre en pièces. Il y a six Trolls en tout. Chacun dispose de 10\n" +
                        "POINTS DE VIE. Ils n'ont pas l'air de se méfier, vous pouvez donc frapper un premier\n" +
                        "coup contre l'un d'entre eux. Les autres, néanmoins, répliqueront à tour de rôle, avant\n" +
                        "que vous ne puissiez porter un nouveau coup. Ils vous frappent en faisant un 6, et leurs\n" +
                        "épées pourront vous infliger 2 Points de Dommage supplémentaires. Leurs armures,\n" +
                        "de qualité médiocre, ne peuvent annuler qu'un seul Point de Dommage. Maintenant,\n" +
                        "vous pouvez lancer vos dés. Si vous êtes vainqueur, rendez-vous au 99. Sinon, vous\n" +
                        "avez droit au 14.\n");

        chapter98.addChoice(new Choice("Page 99", "99"));
        chapter98.addChoice(new Choice("Page 103", "103"));
        chapter98.addChoice(new Choice("Page 99", "99"));
        chapter98.addChoice(new Choice("Page 14", "14"));

        Chapter chapter99 = new Chapter("99", "",
                "99\n" +
                        "Le passage, qui semble fort fréquenté, débouche quelques deux cents mètres plus loin\n" +
                        "sur une immense caverne, dont la suffocante puanteur vous prend à la gorge. Votre\n" +
                        "torche vous révèle bientôt l'origine de cette odeur : au centre de la caverne est amassé\n" +
                        "un énorme monceau de déjections de Dragons. Vous portez aussitôt la main à la garde\n" +
                        "de votre épée, mais une brève inspection des lieux vous amène à la conclusion qu'il n'y\n" +
                        "a, pour le moment, aucun Dragon dans les parages. Posté au centre de a caverne, tout\n" +
                        "près du tas de fumier, vous constatez qu'il existe trois issues possibles.\n" +
                        "Si vous empruntez le passage ouest, rendez-vous a 98.\n" +
                        "Si vous empruntez le passage nord, rendez-vous au 105.\n" +
                        "Le passage est presque totalement obstrué par un enorme bloc de rocher. Si vous\n" +
                        "désirez partir dans cette direction, lancez deux dés pour savoir si vous êtes\n" +
                        "suffisamment fort pour déplacer ce rocher. Si vous faites de 2 à 6, il ne bouge pas d'un\n" +
                        "millimètre. Si vous faites de 7 à 12, vous réussissez, malgré son poids, à le déplacer, et\n" +
                        "vous pouvez vous faufiler dans le passage. Rendez-vous au 102.\n" +
                        "Si vous le désirez, vous pouvez utiliser ici l'une de vos précieuses Boules de Feu. Si\n" +
                        "tout se passe bien. elle pulvérisera le rocher, vous permettant ainsi d'emprunter le\n" +
                        "passage. Rendez-vous au 102. Enfin, vous pouvez farfouiller dans le tas de déjections\n" +
                        "(perspective révoltante !) pour voir s'il ne cache pas quelque chose d'intéressant, avant\n" +
                        "de quitter la caverne. Rendez-vous dans ce cas au 111.\n");

        chapter99.addChoice(new Choice("Page 98", "98"));
        chapter99.addChoice(new Choice("Page 105", "105"));
        chapter99.addChoice(new Choice("Page 102", "102"));
        chapter99.addChoice(new Choice("Page 111", "111"));

        Chapter chapter100 = new Chapter("100", "",
                "100\n" +
                        "Vous avez un peu mal au ventre à présent. Et ça ne fait que s'aggraver. Vous n'auriez\n" +
                        "peut-être pas dû ingurgiter autant de beignets. Ou tous ces gâteaux A moins que la\n" +
                        "nourriture ne soit empoisonnée Aïe ! Elle est empoisonnée, en effet ! Vous sentez le\n" +
                        "poison se répandre dans vos veines, envahir chaque cellule, chaque fibre de votre\n" +
                        "corps. Cela n'a rien de drôle. Sortez vite vos dés pour savoir si vous allez être renvoyé\n" +
                        "au fatidique 14.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 6 : rendez-vous au 97.\n" +
                        "de 7 à 12 : rendez-vous au 109.\n");

        chapter100.addChoice(new Choice("Page 97", "97"));
        chapter100.addChoice(new Choice("Page 109", "109"));

        Chapter chapter101 = new Chapter("101", "",
                "101\n" +
                        "Proclamation à tous les aventuriers : Moi, Ethel- berg, Moine Guerrier et fidèle sujet\n" +
                        "d'Arturus Rex, fils de Uthur Pendragon et légitime Suzerain du Royaume d'Avalon,\n" +
                        "atteste par la présente en toute vérité que, moi-même, ledit Ethelberg, par la grâce de\n" +
                        "Dieu et d'un bras droit robuste, ai atteint cet endroit que les hommes appellent l'Antre\n" +
                        "du Dragon et me suis aventuré à l'intérieur. Bientôt je devrai m'aventurer de nouveau\n" +
                        "dans cet endroit terrible, risquant ainsi ma raison et ma vie même ; je rédige donc ce\n" +
                        "message sur ce parchemin au cas ou je périrais, afin qu'il puisse aider ceux qui, après\n" +
                        "moi pourraient parvenir jusqu'à ce lieu maudit. Tout d'abord, il faut traverser un désert\n" +
                        "volcanique, cerné de hautes murailles, si bien que deux itinéraires seulement sont\n" +
                        "accessibles au voyageur. L'un conduit à l'Antre, l'autre à une mort certaine. Évitez le\n" +
                        "chemin qui vous paraît le plus évident et vous atteindrez l'Antre.\n" +
                        "L'Antre lui-même est facilement reconnaissable à sa taille et à son odeur, un mélange\n" +
                        "nauséabond de soufre et d'haleine de Dragon. Vous pouvez vous aventurer sans trop\n" +
                        "de danger dans la première caverne, car le Dragon niche beaucoup plus bas dans le\n" +
                        "labyrinthe terrifiant, et il n'y a guère ici que les ossements rongés de ceux qui ont péri.\n" +
                        "Vous découvrirez que plusieurs choix s'offrent à voir pour sortir de la première\n" +
                        "caverne. Aucun chemin n'est sûr, car tous vous conduiront dans des dédales de boyaux\n" +
                        "et de tunnels creusés au cours des siècles à travers la roche vive dans les entrailles\n" +
                        "mêmes de la terre.\n" +
                        "On a dit que des créatures étranges, autres que les Dragons, hantaient le labyrinthe et\n" +
                        "j'ai découvert que c'était vrai. Il est possible que certaines de ces espèces soient\n" +
                        "débonnaires. Je ne saurais le dire, car toutes celles que j'ai rencontrées étaient\n" +
                        "redoutables. Il y a ici des êtres dont les hommes ne parlent qu'à mots couverts, des\n" +
                        "êtres qui, selon les sages et les érudits, relèvent du domaine des mythes. Mais ce ne\n" +
                        "sont pas des mythes. Je l'affirme solennellement, car je les ai vus de mes propres yeux,\n" +
                        "je les ai combattus avec mon épée et mes sortilèges de Moine. A ma connaissance, il y\n" +
                        "a une race de trolls, un clan de nains bossus, une maléfique créature humaine à tête de\n" +
                        "taureau, une femme serpent, et un esprit gémissant qui peut ôter la vie à un aventurier\n" +
                        "rien qu'en le touchant. Je prie le ciel que vous ne rencontriez jamais aucun de ces\n" +
                        "monstres, car je les ai, moi, rencontrés et seule la grâce de Dieu m'a permis de m'en\n" +
                        "sortir vivant. Il en existe peut-être d'autres. Je ne le sais pas avec certitude mais je le\n" +
                        "crains. Peut-être les decouvrirai-je quand je m'aventurerai de nouveau dans cet endroit.\n" +
                        "Ces créatures partagent la tanière du Dragon, évitant les grands cracheurs de feu\n" +
                        "lorsqu'elles le peuvent. Les Dragons eux-mêmes gîtent un niveaux inférieurs, mais l'un\n" +
                        "d'entre eux, ou même plusieurs à la fois, risquent d'emprunter les galeries pour sortir\n" +
                        "de la caverne. Le danger est minime néanmoins, car lorsqu'ils veulent se nourrir ou\n" +
                        "s'accoupler, ils prennent en général leur envol, emergeant d'une vaste cheminée\n" +
                        "naturelle qui s ouvre tout en haut de la falaise. Mais si vous pouvez éviter les Dragons\n" +
                        "dans les galeries, vous ne les eviterez pas dans les niveaux inférieurs... Ils y grouillent\n" +
                        "comme des fourmis, et il en existe beaucoup plus que l'on ne l'a jamais soupçonné à\n" +
                        "Avalon. Avancez donc avec prudence et circonspection, brave aventurier. Je ne vivrai\n" +
                        "peut-être pas suffisamment longtemps pour raconter ma propre histoire, mais je prie le\n" +
                        "ciel pour que vous viviez pour raconter la vôtre. Sî vous réussissez, souvenez-vous de\n" +
                        "moi à mâtines et aux vêpres, en reconnaissance de l'aide que je vous ai apportée par cet\n" +
                        "écrit. Je signe de mon nom :\n" +
                        "ETHELBERG, Moine Guerrier.\n");

        chapter101.addChoice(new Choice("Page 35", "35"));
        chapter101.addChoice(new Choice("Page 27", "27"));

        Chapter chapter102 = new Chapter("102", "",
                "102\n" +
                        "le tunnel vous conduit sain et sauf dans une petite grotte, apparemment vide. Vous y\n" +
                        "remarquez trois issues.\n" +
                        "L'une, au sud, menant au 108.\n" +
                        "Une autre, au nord-ouest, menant au 99.\n" +
                        "La troisième, à l'est, menant au 112.\n" +
                        "Du coin de l'œil, vous percevez un bref frémissement ! Vous pivotez sur vous-même,\n" +
                        "mais il n'y a rien. Un autre frémissement. Vous vous tournez de nouveau. Toujours\n" +
                        "rien. Quelque chose vous effleure le bras gauche, le glaçant jusqu'aux os. Pendant une\n" +
                        "fraction de seconde, vous plongez votre regard dans les yeux luisants, évanescents,\n" +
                        "d'un Esprit. Puis la créature disparaît aussitôt. Un Esprit ? Ces apparitions sont\n" +
                        "redoutables. On ne peut les combattre qu'avec des sortilèges. Les armes classiques ne\n" +
                        "leur infligent aucun dommage L'Esprit vous attaque, Pip ! Ce simple effleurement\n" +
                        "vous coûte 10 POINTS DE VIE. (S'il vous a ôté la vie. rendez-vous au 14.) Il vous\n" +
                        "faut user de vos sortilèges ! L'Esprit dispose de 25 POINTS DE VIE. Il ripostera avec\n" +
                        "succès s'il sort 6 ou plus aux dés, vous infligeant 3 Points de Dommage à chaque\n" +
                        "effleurement\n" +
                        "Si vous tuez l'Esprit, vous pouvez quitter la grotte\n" +
                        "par l'issue de votre choix.\n" +
                        "Si l'Esprit vous tue, rendez-vous au 14.\n");

        chapter102.addChoice(new Choice("Page 108", "108"));
        chapter102.addChoice(new Choice("Page 99", "99"));
        chapter102.addChoice(new Choice("Page 112", "112"));
        chapter102.addChoice(new Choice("Page 14", "14"));

        Chapter chapter103 = new Chapter("103", "",
                "103\n" +
                        "Lancez deux dés. Si vous faites :\n" +
                        "de 2 à 9 : les Trolls, très agressifs de nature demeurent inaccessibles à tout\n" +
                        "raisonnement. Retournez au 98 et refaites votre choix, de 10 à 12 : les Trolls vous\n" +
                        "laissent passer. Rendez- vous au 99\n");

        chapter103.addChoice(new Choice("Page 98", "98"));
        chapter103.addChoice(new Choice("Page 99", "99"));

        Chapter chapter104 = new Chapter("104", "",
                "104\n" +
                        "on entend des bruissements dans le grain. Des bruissements accentués. Pouah ! ce\n" +
                        "sont des rats ! Il doit y en avoir des centaines à en juger par le bruit. Mais non, pas du\n" +
                        "tout ! Il n'y en a qu'un ! De la taille d'un chien-loup ! Il vous fixe un instant de ses yeux\n" +
                        "roses, luisants, et ses dents sont aiguës comme des poignards. Attention, Pip, il va se\n" +
                        "jeter sur vous ! Lancez rapidement les dés pour savoir si vous réussirez a le transpercer\n" +
                        "de votre épée. Le Rat-Loup dispose de 25 POINTS DE VIE et ses morsures infligent 2\n" +
                        "Points de Dommage s'il sort un 5 ou davantage.\n" +
                        "Si le Rat vous tue, rendez-vous au 14. Si vous tuez le Rat, reprenez votre carte du\n" +
                        "village de la Pierre-qui- mue et explorez un autre endroit. Mais ATTENTION : la\n" +
                        "morsure du Rat provoque des maladies, et s il a réussi a gagner un coup contre vous,\n" +
                        "vous devez impérativement vous soigner avant de quitter le village, sinon vous êtes\n" +
                        "condamné. Regardez avec soin dans toutes les chaumières. Il y a certainement\n" +
                        "quelque potion curative rangée quelque part\n");

        chapter104.addChoice(new Choice("Page 14", "14"));
        chapter104.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter105 = new Chapter("105", "",
                "105\n" +
                        "Vous vous trouvez non loin de l'entrée d'une autre caverne, et vous remarquez sur\n" +
                        "votre droite, l'entree d un nouveau couloir.\n" +
                        "Si vous voulez pénétrer dans la caverne, rendez-vous au 114.\n" +
                        "Si vous préférez prendre le couloir de droite rendez- vous au 120\n");

        chapter105.addChoice(new Choice("Page 114", "114"));
        chapter105.addChoice(new Choice("Page 120", "120"));

        Chapter chapter106 = new Chapter("106", "",
                "106\n" +
                        "Quelle trouvaille ! Quelle trouvaille ! C'est une carte de Antre du Dragon ! Du\n" +
                        "moins, un fragment de carte. Quand vous atteindrez la caverne, si vous l'atteignez\n" +
                        "jamais, vous pourrez vous reporter à ce document pour trouver votre chemin. Il\n" +
                        "n'indique pas 1’entree, mais il décrit le labyrinthe et peut en conséquence, vous\n" +
                        "sauver la vie. La carte figure 'sur la page ci-contre. Vous pouvez la consulter à n'im-\n" +
                        "porte quel moment après avoir quitté l'abbaye Reprenez maintenant la carte du\n" +
                        "village et poursuivez vos explorations.\n");

        chapter106.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter107 = new Chapter("107", "",
                "107\n" +
                        "L'interieur de la crypte est tendu de magnifiques draperies de velours noir et le sol, les\n" +
                        "murs et le plafond, sont du marbre blanc le plus fin. Au centre est dressee une petite\n" +
                        "estrade sur laquelle repose un cercueil en ébène incrusté de cuivre étincelant. Sur\n" +
                        "l'estrade, une inscription déclare :\n" +
                        "Recru de lassitude\n" +
                        "Dans la désespérance\n" +
                        "Ici vous êtes parvenu\n" +
                        "Dans un ultime effort\n" +
                        "Et l'espoir d'y trouver\n" +
                        "Un être cher ou bien la mort.\n" +
                        "La médiocrité de ce texte vous concerne (mais VOUS vous rappelez néanmoins que, s'il\n" +
                        "s'agit vraiment de Nosférax le Poète vous devrez prendre grand soin de vanter sa\n" +
                        "poésie lorsqu'il se réveillera) et vous montez sur l'estrade. Bien entendu, sur le\n" +
                        "couvercle du cercueil une plaque de cuivre porte l'inscription suivante :\n" +
                        "Pour réveiller Nosférax, prononcez à voix haute la réponse à cette énigme :\n" +
                        "QUELLE EST LA DIFFÉRENCE ENTRE UN CANARD ?\n" +
                        "Donnez votre réponse à voix haute maintenant.\n" +
                        "Si vous répondez : « C'est une énigme stupide ». rendez-vous au 116.\n" +
                        "Si vous répondez : « Je ne sais pas », rendez-vous au 121.\n" +
                        "Si vous répondez : « L'une de ses pattes se ressemble », rendez-vous au 122.\n");

        chapter107.addChoice(new Choice("Page 116", "116"));
        chapter107.addChoice(new Choice("Page 121", "121"));
        chapter107.addChoice(new Choice("Page 122", "122"));

        Chapter chapter108 = new Chapter("108", "",
                "108\n" +
                        "Vous vous trouvez à l'intérieur d'une grotte naturelle, dont le sol est littéralement\n" +
                        "jonché d'ossements et de crânes. La plupart proviennent d'animaux, certains,\n" +
                        "d'humains, plusieurs de créatures non identifiables. Rien ne bouge ici. Vous n'avez\n" +
                        "conscience que du silence. Il y a trois issues dans la paroi nord de cette grotte.\n" +
                        "Laquelle allez vous choisir ?\n" +
                        "L'issue de gauche ? Rendez-vous au 98.\n" +
                        "L\"issue de droite ? Rendez-vous au 99.\n" +
                        "l'issue centrale ? Rendez-vous au 102.\n" +
                        "un. dernier avertissement, Pip. Les tunnels sont étroits. En les examinant à la lumière\n" +
                        "vacillante de votre torche, vous constatez qu'ils tournent et s'infléchissent dans tous les\n" +
                        "sens. Tout au fond de vous- même, vous savez que vous risquez de faire un choix fatal.\n" +
                        "Car, dans cette partie de votre aventure, vous ne pourrez revenir en arrière. En avant\n" +
                        "donc ! Vers la gloire... ou la mort !\n");

        chapter108.addChoice(new Choice("Page 98", "98"));
        chapter108.addChoice(new Choice("Page 99", "99"));
        chapter108.addChoice(new Choice("Page 102", "102"));

        Chapter chapter109 = new Chapter("109", "",
                "109\n" +
                        "Vous vous tordez de douleur, Pip, vous avez bel et bien été empoisonné. Rendez-vous\n" +
                        "au 14.\n");

        chapter109.addChoice(new Choice("Page 14", "14"));

        Chapter chapter110 = new Chapter("110", "",
                "110\n" +
                        "Cretin ! Vous venez de vous laisser sacrifier par les Moines. Vous voulez tous les\n" +
                        "détails sanglants? peut-être pas. Rendez-vous donc au 14.\n");

        chapter110.addChoice(new Choice("Page 14", "14"));

        Chapter chapter111 = new Chapter("111", "",
                "111\n" +
                        "Vous avez trouvé un anneau ! Il s'adapte parfaitement au doigt de votre main gauche.\n" +
                        "Le problème c'est qu'après l'avoir essayé, vous ne pouvez plus le retirer. Et il tinte\n" +
                        "légèrement. Un tintement ? A quoi peut bien rimer ce tintement? Mais peu importe\n" +
                        "pour l'instant. Revenez au 99, et décidez de la direction à prendre.\n");

        chapter111.addChoice(new Choice("Page 99", "99"));

        Chapter chapter112 = new Chapter("112", "",
                "112\n" +
                        "Le passage s'élargit brusquement et vous vous retrouvez sur la berge rocheuse d'un\n" +
                        "vaste lac souterrain. Aucun chemin n'apparaît autour de ces eau. sombres, immobiles.\n" +
                        "Mais, amarré à quelques mètres de vous, flotte un vieux canot à rames disloqué. Si\n" +
                        "vous avez découvert précédemment au cours, de cette aventure que vous saviez nager,\n" +
                        "peut-être aurez-vous envie de vous baigner dans ce lac (Si vous ignorez si vous savez\n" +
                        "nager, ne prenez pas ce risque.)\n" +
                        "Si vous voulez nager, rendez-vous au 123.\n" +
                        "Si vous préférez vous hasarder dans le canot, qui fait\n" +
                        "eau manifestement, rendez-vous au 147.\n");

        chapter112.addChoice(new Choice("Page 123", "123"));
        chapter112.addChoice(new Choice("Page 147", "147"));

        Chapter chapter113 = new Chapter("113", "",
                "113\n" +
                        "Après avoir compté votre argent avec le plus grand soin, le Gnome vous annonce qu'il\n" +
                        "y a deux façons de sortir du village. Deux des chaumières ont des portes de derrière et\n" +
                        "l'une ou l'autre vous permettra de franchir la palissade.\n" +
                        "Mais quelles chaumières ? demandez-vous.\n" +
                        "Cela vous coûtera 500 Pièces d'Or en plus, répond le Gnome d'un ton méprisant.\n" +
                        "Certainement pas ! vous exclamez-vous en tirant à demi votre épée d'un geste\n" +
                        "menaçant.\n" +
                        "Non, non bien sûr, acquiesce le Gnome. Je plaisantais. Vous ne comprenez pas la\n" +
                        "plaisanterie ?\n" +
                        "Les chaumières, questionnez-vous à nouveau d un air sombre.\n" +
                        "Oui, oui. Les chaumières. 38 et 43. L'une ou\n" +
                        "l autre.la -dessus, il redisparaît précipitamment à l'intérieur de sa maison dont il ferme\n" +
                        "la porte à clé. Retournez à votre carte du village de la Pierre-qui- Mue et allez où vous\n" +
                        "voulez.\n");

        chapter113.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter114 = new Chapter("114", "",
                "114\n" +
                        "Quelle misérable petite caverne ! Basse de plafond, sans issue et absolument envahie\n" +
                        "de moisissures répugnantes et malodorantes. En ce moment même, cette moisissure est\n" +
                        "en train de dévorer votre jambe !\n" +
                        "Courez, Pip ! Trop tard. Votre jambe vient de se détacher ! La moisissure vous dévore\n" +
                        "maintenant la tête. Rendez-vous au 14.\n");

        chapter114.addChoice(new Choice("Page 14", "14"));

        Chapter chapter115 = new Chapter("115", "",
                "115\n" +
                        "Quelle trouvaille ! Quelle trouvaille ! Vous avez découvert un rouleau de parchemin.\n" +
                        "Et voilà ce qui est écrit dessus :\n" +
                        "Que l'on sache que moi, Ethelberg, Moine Guerrier et fidèle sujet de Arturus Rex, fils\n" +
                        "de Uthur Pendragon et légitime Suzerain du Royaume d'Avalon, suis parvenu\n" +
                        "jusqu'ici, par la grâce de Dieu et d'un bras droit robuste, dans ma quête de ce lieu que\n" +
                        "les hommes appellent l'Antre du Dragon. Et que l'on sache qu'après avoir été pris au\n" +
                        "piège durant plusieurs mois dans le village maudit de la Pierre-qui-Mue avec ses\n" +
                        "magies maléfiques et tous les périls qui vous y menacent, j'ai enfin découvert le\n" +
                        "véritable chemin qui conduit directement d'ici, j'en suis persuadé, à l'Antre du Dragon.\n" +
                        "Je prends donc ma plume pour inscrire ces renseignements au cas où je périrais au\n" +
                        "cours de ma quête, en sorte qu'ils puissent rendre quelque service à tel courageux\n" +
                        "aventurier qui suivrait mes traces. Le chemin, en termes clairs, est le suivant : Tout\n" +
                        "d'abord, rendez-vous à la tour en ruine et cherchez-y avec diligence une entrée. Cette\n" +
                        "entrée trouvée, avancez et poursuivez vos recherches avec la même diligence. A\n" +
                        "moitié enfoui sous les gravats se cache une trappe en bois à demi pourrie. Cette trappe\n" +
                        "une fois ouverte, vous verrez des marches de pierre qui descendent. N'ayez crainte,\n" +
                        "descendez et suivez le chemin. Bientôt vous émergerez à la lumière du jour et dans un\n" +
                        "désert de lave durcie, malodorant et cerné de hautes falaises. Voici, je le proclame, la\n" +
                        "route à suivre pour arriver à l'Antre du Dragon. Pensez à moi aux mâtines en souvenir\n" +
                        "de ce modeste service. Je signe de mon nom :\n" +
                        "ETHELBERG, Moine Guerrier\n" +
                        "Reprenez maintenant votre carte du village de 1a Pierre-qui-Mue. Vous pouvez\n" +
                        "poursuivre votre exploration, ou suivre les directives données sur le parchemin.\n");

        chapter115.addChoice(new Choice("La tour - Page 30", "30"));
        chapter115.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter116 = new Chapter("116", "",
                "116\n" +
                        "Aussitôt, le couvercle du cercueil se rabat, et une mince silhouette d'une mortelle\n" +
                        "pâleur en tenue de soirée et longue cape noire en bondit avec une effrayante célérité.\n" +
                        "Cette créature a des yeux roses et ses canines supérieures chevauchent sa lèvre infé-\n" +
                        "rieure. Qui plus est, elle a l'air furieux.\n" +
                        "Stupide, vraiment ? crie Nosférax. Vous allez, je suppose, me dire que ma poésie, elle\n" +
                        "aussi, est stupide !\n" +
                        "Non, non ! protestez-vous, vous rappelant que Nosférax a la réputation d'être\n" +
                        "redoutable s'il n'entend pas louer son exécrable poésie. Je suis un de vos plus fervents\n" +
                        "et dévoués admirateurs. Vous êtes pour moi l'un des plus grands poètes, de tous les\n" +
                        "temps et de tout l'univers, auprès de qui Shakespeare, Keats. Yeats, Shelley et même\n" +
                        "William MacGonigle ne sont que des pâles rimailleurs.\n" +
                        "Nosférax semble quelque peu calmé par cette déclaration, bien qu'une lueur\n" +
                        "dangereuse continue à briller dans ses yeux.\n" +
                        "Très bien, dit-il. Je vous pardonne, mais à une seule condition...\n" +
                        "N'importe laquelle, Nosférax le Poète ! vous exclamez-vous avec courage, prêt à\n" +
                        "affronter n'importe quel péril pour vous attirer les bonnes grâces de cette créature\n" +
                        "étrange (mais absolûment magique).\n" +
                        "— Vous devez faire mon portrait, déclare Nosférax d'un petit air prétentieux. Prenez\n" +
                        "ceci... et il vous tend une feuille de parchemin vierge.\n" +
                        "Vous feriez bien d'attaquer ce portrait, Pip. Usez de votre imagination pour créer un\n" +
                        "personnage digne d'être accroché au Musée de Londres. Ou dans UN\n" +
                        "cimetière.\n" +
                        "Lorsque vous aurez terminé, rendez-vous au 127\n");

        chapter116.addChoice(new Choice("Page 127", "127"));

        Chapter chapter117 = new Chapter("117", "",
                "117\n" +
                        "Vous montez à bord du canot, vous repêchez les rames dans l'eau croupie, au fond de\n" +
                        "la coque, vous les glissez dans les tolets, et vous vous écartez du rivage. L'eau sombre\n" +
                        "absorbe la lumière de la torche que vous avez fixée à l'avant de votre embarcation, et\n" +
                        "vous avez l'impression de ramer dans une nuit éternelle. L'eau qui s'infiltre dans le\n" +
                        "bateau par de multiples fissures clapote déjà autour de vos chevilles, alors que vous\n" +
                        "pesez sur les avirons pour essayer de gagner l'autre rive avant que cette vieille coque\n" +
                        "de noix ne coule à pic. Lancez deux dés pour savoir si vous traverserez le lac sain et\n" +
                        "sauf.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 4 : rendez-vous au 124.\n" +
                        "de 5 à 12 : rendez-vous au 132.\n");

        chapter117.addChoice(new Choice("Page 124", "124"));
        chapter117.addChoice(new Choice("Page 132", "132"));

        Chapter chapter118 = new Chapter("118", "",
                "118\n" +
                        "Vous fouillez précipitamment dans vos affaires à la recherche d'un gantelet mais, n'en\n" +
                        "trouvant pas. vous vous emparez de celui en métal que vous voyez posé sur la table.\n" +
                        "D'un geste prompt, vous jetez le gantelet au visage du Chevalier Noir (heureusement\n" +
                        "protégé par une visière) pour le provoquer en combat singulier.\n" +
                        "Hé, du calme ! s'exclame le Chevalier Noir Qu'est-ce qui vous prend ?\n" +
                        "Je vous provoque en combat singulier, répliquez- vous, brûlant de dégainer votre épée.\n" +
                        "Pourquoi cette idée saugrenue ?\n" +
                        "Parce que, répondez-vous, vous êtes le redoutable Chevalier Noir que chacun désigne\n" +
                        "à voix basse Comme le plus infâme de tous les chevaliers du Royaume. Je veux\n" +
                        "débarrasser Avalon de votre présence nauséabonde.\n" +
                        "Ne soyez pas ridicule, réplique le Chevalier Noir. Je suis le roi Pellinore.\n" +
                        "Là-dessus, il enlève son heaume, apportant la preuve de ce qu'il avance. Quelle gaffe !\n" +
                        "Quelle bourde ! Le roi Pellinore est l'un des plus fidèles amis du roi Arthur. Si vous\n" +
                        "n'aviez pas manifesté une telle précipitation, il aurait pu vous aider, peut-être. Compte\n" +
                        "tenu de la situation, vous ne pouvez que vous incliner bien bas, faire des courbettes,\n" +
                        "ramper, vous répandre en excuses, et sortir à reculons de la chaumière. Honteux, vous\n" +
                        "reprenez alors votre carte du village pour aller en explorer une autre partie.\n");

        chapter118.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter119 = new Chapter("119", "",
                "119\n" +
                        "Rien. Vous ne trouvez strictement rien. Au diable les stupides dictons romains sur les\n" +
                        "vainqueurs et les dépouilles. Nihil ad victor, comme disaient les Romains les plus\n" +
                        "sensés : du vent pour le Vainqueur ! En maugréant, vous consultez une fois de plus la\n" +
                        "carte du village pour décider où vous allez maintenant porter vos pas.\n");

        chapter119.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter120 = new Chapter("120", "",
                "120\n" +
                        "Le passage est orienté plein est pendant un certain caps, puis il s'incurve, d'abord vers\n" +
                        "le nord-est et ensuite, presque à angle droit, vers le nord. Vous percevez une étrange\n" +
                        "odeur, qui évoque un peu celle de l étable chez vos parents adoptifs mais plus\n" +
                        "pénétrante, où flotte, si l'on peut dire, comme une menace. Vous poursuivez\n" +
                        "néanmoins votre chemin. PIP n'est pas un aventurier pour rien ! pendant que des idées\n" +
                        "fantasques vous traversent l\"esprit, vous atteignez l'extrémité du passage et vous\n" +
                        "pénétrez dans une autre caverne. Vous remarquez une issue dans la paroi nord, et une\n" +
                        "autre à l'est. Trois grands coffres cerclés de cuivre, et une petite cassette assortie, sont\n" +
                        "posés sur le sol, à environ cinq mêtres devant vous. Cet endroit serait intéressant et\n" +
                        "amusant à explorer à loisir, si ce n'était un petit détail. Entre vous et les coffres (sans\n" +
                        "parler des issues) se dresse un personnage de deux mètres de haut, bardé de muscles, et\n" +
                        "qui tient une épée nue. Mais ce n'est pas l'épée que vous regardez pour le moment, si\n" +
                        "menaçante soit-elle : vous fixez la tête du personnage qui est celle d'un taureau... Vous\n" +
                        "êtes entré dans la grotte du Minotaure !\n" +
                        "Halte ! mugit le Minotaure, grattant le sol de son pied droit Personne ne passe par ici !\n" +
                        "Ne criez pas si fort, monstre stupide ! retorquez- vous, plus téméraire peut-être que\n" +
                        "vous ne l'êtes en\n" +
                        "réalité. Je n'ai nulle intention de m'en prendre à vous. j\" essaye simplement de trouver\n" +
                        "le Dragon de Bronze.\n" +
                        "Toi ? ricane le Minotaure. Un brimborion de ton espèce, à la recherche du Dragon de\n" +
                        "Bronze ?\n" +
                        "Je ne suis pas un brimborion, répondez-vous avec dignité. Je m'appelle Pip. Peut-être\n" +
                        "avez-vous entendu parler de moi ?\n" +
                        "le Minotaure secoue son énorme tête en soufflant par les naseaux.\n" +
                        "Ma foi, non.\n" +
                        "Alors, reprenez-vous, peut-être avez-vous entendu parler de l'homme qui m'a envoyé,\n" +
                        "Merlin, le plus grand magicien d'Avalon.\n" +
                        "Merlin ? Je l'aurais cru mort de vieillesse.\n" +
                        "Tout ce qu'il y a de vivant, répondez-vous vivement, partant du principe que de bonnes\n" +
                        "paroles valent mieux que la bagarre, surtout quand on doit affronter un être aussi\n" +
                        "coriace que le Minotaure.\n" +
                        "Et tu le connais ? Personnellement ?\n" +
                        "Bien sûr !\n" +
                        "Le Minotaure cesse de gratter le sol du pied.\n" +
                        "Tu crois que tu pourrais le persuader de s'occuper de ma tête ?\n" +
                        "Qu'est-ce qu'elle a, votre tête ? demandez-vous, pensant que le monstre est peut-être\n" +
                        "affligé de migraines.\n" +
                        "C'est une tête de taureau, répond le Minotaure. Tu ne l'avais pas remarqué ?\n" +
                        "Eh bien... si, avouez-vous.\n" +
                        "Le Minotaure s'assied sur un des coffres et il appuie son épée contre son genou.\n" +
                        "Tristement il laisse pendre son énorme tête de taureau.\n" +
                        "Comme la plupart des gens, fait-il remarquer. Il relève la tête. Tu ne t'imagines tout de\n" +
                        "même pas que je suis né comme ça ? Et avant que vous ayez pu répondre, il continue.\n" +
                        "Non, bien sûr. J'étais un enfant parfaitement normal, un bel enfant, comme\n" +
                        "Je vivais à Athènes, un petit village grec dont tu n\"as peut-être pas entendu parler. Ma\n" +
                        "tête est devenue comme ça parce que je mangeais trop de hamburgers, je crois. Je ne\n" +
                        "suis pas vraiment sûr, maisc'est la seule raison que je puisse trouver. Tous mes amis se\n" +
                        "sont détournés de moi, et si le Roi de Crète a eu la gentillesse de m'employer un\n" +
                        "certain temps comme gardien de son labyrinthe, le salaire était ridicule, alors j'ai fini\n" +
                        "par démissionner pour venir me cacher ici. Penses-tu que Merlin pourrait me guérir ?\n" +
                        "J'en suis persuadé, répondez-vous. Il est très doué pour changer la forme des choses.\n" +
                        "Si tu pouvais obtenir de lui qu'il s'occupe de moi. dit le Minotaure, je t'en serais\n" +
                        "éternellement reconnaissant.\n" +
                        "Me laisseriez-vous passer à travers votre grotte sans me faire de mal ? demandez-vous\n" +
                        "d'un ton circonspect.\n" +
                        "Impossible. Toute personne qui entre ici doit se battre contre moi, c'est la tradition.\n" +
                        "Mais nous pouvons nous livrer à un simulacre de combat, sans armes. Le premier qui\n" +
                        "prend 10 POINTS DE VIE a l'autre sera le vainqueur. Si tu gagnes, tu pourras\n" +
                        "traverser ; je te laisserai même chercher dans ces coffres un objet utile. Si tu perds, tu\n" +
                        "devras retourner tout droit auprès de Merlin et t'arranger pour qu'il s'occupe de ma tête.\n" +
                        "Es-tu d'accord ?\n" +
                        "Tout à fait d'accord ! dites-vous, avec un certain soulagement. Alors, on se bat\n" +
                        "maintenant ?\n" +
                        "Allons-y ! répond le Minotaure tout excité, en se levant d'un bond.\n" +
                        "Lancez deux dés pour connaître l'issue du combat. Le Minotaure a besoin d'un 6 pour\n" +
                        "frapper, exactement comme vous puisqu'il s'agit d'un combat à mains nues. Le premier\n" +
                        "coup de dés désigne celui qui frappera le premier. Si vous êtes vainqueur, rendez-\n" +
                        "vous au 126. Sinon, rendez-vous au 133.\n" +
                        "1\n");

        chapter120.addChoice(new Choice("Page 126", "126"));
        chapter120.addChoice(new Choice("Page 133", "133"));

        Chapter chapter121 = new Chapter("121", "",
                "121\n" +
                        "Aussitôt le couvercle du cercueil se rabat et une mince silhouette d'une mortelle pâleur\n" +
                        "en tenue de soirée et longue cape noire en bondit avec une effrayante célérité. Cette\n" +
                        "créature a des yeux roses et ses canines supérieures chevauchent sa lèvre inférieure.\n" +
                        "Qui plus est, elle a l'air furieux. — Vous ne savez pas ? hurle Nosférax. En voilà une\n" +
                        "reponse ! Tout le monde sait que l'une de ses pattes se ressemble !\n" +
                        "Là-dessus, il referme violemment le couvercle de son cercueil et vous ne réussirez\n" +
                        "jamais à le persuader de sortir de nouveau.\n" +
                        "Reprenez la carte du village de la Pierre-qui-Mue et poursuivez votre exploration.\n");

        chapter121.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter122 = new Chapter("122", "",
                "122\n" +
                        "Aussitôt le couvercle du cercueil se rabat et une mince silhouette d'une mortelle pâleur\n" +
                        "en tenue de soirée et longue cape noire en bondit avec une effrayante célérité. Cette\n" +
                        "créature a des yeux roses et ses canines supérieures chevauchent sa lèvre inférieure,\n" +
                        "même lorsqu'elle sourit, ce qui est le cas en ce moment.\n" +
                        "Bien joué, mon cher et courageux visiteur ! Bien joué ! Je n'aurais pas mieux résolu\n" +
                        "moi-même cette énigme. Si ce n'est en vers, bien entendu. Quelque chose dans le genre\n" +
                        ":\n" +
                        "Telle était la question du Sphinx : Quelle est la différence entre un canard ?\n" +
                        "Enigme, semble-t-il, sans fard. Favori de la. chance Les yeux plantés dans\n" +
                        "ceux du Sphinx, Je lui déclare plein d'assurance : L'une de ses pattes se\n" +
                        "ressemble.\n" +
                        "Voilà, dit Nosférax, les yeux brillants. Qu'est-ce que vous pensez de ça comme\n" +
                        "réponse poétique ?\n" +
                        "Superbe ! répondez-vous, vous rappelant que Nosférax aime entendre vanter ses vers.\n" +
                        "Les allusions mythologiques me semblent tout à fait appropriées.\n" +
                        "Oui, dit Nosférax, visiblement ravi. C'est aussi mon avis. Maintenant, comme vous\n" +
                        "êtes de toute évidence un jeune homme plein de goût et de discernement, permettez-\n" +
                        "moi de vous récompenser de votre intelligence.\n" +
                        "Là-dessus, il sort de la poche de son frac une petite tabatière en argent.\n" +
                        "Vous prisez ? demande-t-il. Vous secouez la tête. Tant mieux, approuve Nosférax.\n" +
                        "Une manie répugnante et très mauvaise pour la santé. Vous pouvez néanmoins faire\n" +
                        "exception avec ce mélange. Ce n'est pas du tabac, en fait, mais de l'armoise pilée, et\n" +
                        "bénie par un vicaire de confession anglicane. Elle est douée de propriétés curatives\n" +
                        "exceptionnelles. Prisez une pincée lorsque vous vous sentez affaibli et lancez les deux\n" +
                        "dés deux fois. Le total obtenu indique le nombre de POINTS DE VIE qui vous sont\n" +
                        "restitués. Mais contentez-vous d'une seule prise au cours d'un paragraphe, sinon vous\n" +
                        "serez expédié directement au 14. Compris ? Très bien. Maintenant en route, audacieux\n" +
                        "aventurier, car il fait froid et je dois retourner dans mon cercueil avant d'attraper un\n" +
                        "rhume et de me mettre à éternuer.\n" +
                        "Ei il referme son couvercle d'un coup sec vous laissant la tabatière pleine de mélange\n" +
                        "curatif entre les mains.\n" +
                        "reprenez la carte du village de la Pierre-qui-Mue et poursuivez votre exploration. Et ne\n" +
                        "perdez pas cette tabatière.\n");

        chapter122.addChoice(new Choice("Page 14", "14"));
        chapter122.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter123 = new Chapter("123", "",
                "123\n" +
                        "Vous vous déshabillez avec soin, et vous faites un paquet de vos vêtements, avant de\n" +
                        "plonger dans les eaux glacées du lac souterrain pour vous retrouver dans la gueule d'un\n" +
                        "énorme Poisson qui rôdait dans les profondeurs !\n" +
                        "la situation est délicate. Cette brave E.J. est ficelée dans le paquet, et il vous faut\n" +
                        "essayer d'étrangler ce poisson de vos mains nues. Ou de l'assommer, ou d' en venir à\n" +
                        "bout d'une façon quelconque. Il ne possède que 10 POINTS DE VIE et la tâche ne\n" +
                        "devrait pas etre trop difficile ; mais le problème, c'est que vous etes au fond de l'eau,\n" +
                        "autrement dit, il va falloir vous debarrasser du Poisson en trois coups, sinon vous allez\n" +
                        "vous noyer. Pendant ce temps-là, le Poisson s acharnera à vous mordre, ce qui n'est\n" +
                        "guère bénéfique pour vos POINTS DE VIE.\n" +
                        "Si vous réussissez à assommer ou à tuer le Poisson en trois coups, rendez-vous au 124.\n" +
                        "Sinon, il y a toujours le 14.\n");

        chapter123.addChoice(new Choice("Page 124", "124"));
        chapter123.addChoice(new Choice("Page 14", "14"));

        Chapter chapter124 = new Chapter("124", "",
                "124\n" +
                        "Vous avez des bras robustes, Pip. Ou peut-être une chance inouïe. De toute façon,\n" +
                        "vous avez réussi ! Les chaussures gorgées d'eau, vous traversez la caverne jusqu'à\n" +
                        "l'entrée d'un passage qui vous permet d'en sortir en direction de l'est. Vous pénétrez\n" +
                        "dans ce passage. Rendez-vous au 130.\n");

        chapter124.addChoice(new Choice("Page 130", "130"));

        Chapter chapter125 = new Chapter("125", "",
                "125\n" +
                        "Rendez-vous au 10.\n");

        chapter125.addChoice(new Choice("Page 10", "10"));

        Chapter chapter126 = new Chapter("126", "",
                "126\n" +
                        "Eh bien voyons, dit le Minotaure un peu essoufflé après le combat, maintenant que\n" +
                        "nous voilà débarrassés de cette formalité, tu ferais bien de farfouiller dans mes\n" +
                        "coffres. Cela fait également partie de la tradition, tu sais. Au Vainqueur les\n" +
                        "Dépouilles comme me disait souvent le jeune Jules César, avant: que ma tête n'ait\n" +
                        "pris son aspect actuel. Nous avons alors cessé de nous parler. Mais que je te\n" +
                        "prévienne tu ne peux ouvrir que deux coffres. Dès que tu l'auras fait, les deux autres\n" +
                        "disparaîtront. Un petit tour de magie que j'ai acheté pour protéger mes biens.\n" +
                        "J'espère que tu apprécieras. L'ennui, c'est que je ne sais pas comment annuler cette\n" +
                        "satanée magie, et que je deviens à moitié fou lorsque je dois chercher quelque chose\n" +
                        "dans ces maudits coffres, qui disparaissent et réapparaissent à tout moment- Enfïn\n" +
                        "voyons : nous avons trois coffres, et une cassette, et tu peux ouvrir deux d'entre\n" +
                        "eux. Alors, fais ton choix.\n" +
                        "Vous examinez les coffres l'un après l'autre. Tous trois semblent identiques. Quant\n" +
                        "à la cassette, bien que plus petite, elle en est la réplique exacte.\n" +
                        "Vous ne pourriez pas me dire simplement ce qu'ils contiennent? demandez-vous\n" +
                        "au Minotaure. Mais il secoue sa grosse tête de taureau.\n" +
                        "La tradition, vois-tu... explique-t-il avec tristesse. Comme rien ne distingue un\n" +
                        "coffre de l'autre, vous leur donnez les numéros 1, 2 et 3. Bonne chance !\n" +
                        "-Si vous ouvrez les coffres 1 et 3, rendez-vous au 135.\n" +
                        "Si vous ouvrez les coffres 1 et 2, rendez-vous au 140.\n" +
                        "Si vous ouvrez les coffres 2 et 3, rendez-vous au 146.\n" +
                        "S vous ouvrez le coffre 1 et la cassette, rendez-vous au 143.\n" +
                        "Si vous ouvrez le coffre 2 et la cassette, rendez-vous au 150.\n" +
                        "Si vous ouvrez le coffre 3 et la cassette, rendez-vous au 129.\n");

        chapter126.addChoice(new Choice("Page 135", "135"));
        chapter126.addChoice(new Choice("Page 140", "140"));
        chapter126.addChoice(new Choice("Page 146", "146"));
        chapter126.addChoice(new Choice("Page 143", "143"));
        chapter126.addChoice(new Choice("Page 150", "150"));
        chapter126.addChoice(new Choice("Page 129", "129"));

        Chapter chapter127 = new Chapter("127", "",
                "127\n" +
                        "Quel beau travail ! s'exclame Nosférax le Poète. Quel remarquable effort ! Presque\n" +
                        "digne, à certains égards, de mes premières œuvres, si prometteuses. Cela me rappelle\n" +
                        "en un sens T.S. Eliot dans sa Période Bleue, ou était-ce Picasso? Peu importe. C'est un\n" +
                        "effort admirable et qui mérite une récompense, bien que vous n'ayez pas élucidé\n" +
                        "l'énigme. Et, plongeant une main dans une poche de sa cape d'opéra, il en sort une\n" +
                        "sorte de bonbon au bout d'un bâtonnet.\n" +
                        "Voici une sucette.\n" +
                        "Une sucette ? demandez-vous, surpris et peut-être même un peu déçu, à dire vrai.\n" +
                        "Une sucette magique, précise Nosférax. découvrant ses crocs brillants en un large\n" +
                        "sourire Sucez-la et vous verrez, mais pas tout de suite. Pour ne pas la gaspiller. Vous\n" +
                        "ne pouvez la lécher que trois fois avant qu'elle ne disparaisse. Mais chaque fois que\n" +
                        "vous la lécherez au cours d'un combat ou d'un affrontement quelconque, tous les\n" +
                        "POINTS DE VIE que vous auriez pu perdre vous seront rendus, jusqu'à concurrence\n" +
                        "de votre total de départ, tandis que le même nombre de POINTS DE VIE sera déduit\n" +
                        "de ceux de votre adversaire. Un peu difficile à calculer, mais extrêmement utile, si\n" +
                        "jamais vous êtes en mauvaise posture... Et maintenant (il entreprend de retourner dans\n" +
                        "son cercueil) il me faut malheureusement vous quitter, si plaisante qu'ait été cette\n" +
                        "conversation. Et, là-dessus, il rabat le couvercle. Vous frappez dessus un petit coup\n" +
                        "discret, mais vous n'obtenez qu'une réponse assourdie :\n" +
                        "Adieu, mon jeune ami Espérons que n'est pas finie La Quête que tu\n" +
                        "entrepris Car toi, mon hôte, En dépit du courroux des autres, Tu\n" +
                        "mérites cent fois d'accéder A l'Antre du Dragon.\n" +
                        "Reprenez la carte du village de la Pierre-qui-Mue, et explorez une autre partie\n");

        chapter127.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter128 = new Chapter("128", "",
                "128\n" +
                        "Le cœur léger, vous avancez gaiement le long du passage jusqu'au moment où vous\n" +
                        "tombez dans une fosse.\n" +
                        "lancez deux dés pour déterminer le dommage provoqué par cette chute. Soustrayez le\n" +
                        "résultat des pOINTS DE VIE dont vous disposez. Si cela vous tue, rendez-vous au 14.\n" +
                        "Si vous avez une corde et des crampons dans votre équipement, vous pouvez les\n" +
                        "utiliser pour ressortir de la fosse. Sinon, vous y resterez à jamais. A jamais ? Non !\n" +
                        "Rendez-vous au 14. Si vous sortez de la fosse, vous poursuivez votre chemin. Le\n" +
                        "passage dans lequel vous vous trouvez conduit au 120 dans un sens, et au 130 dans\n" +
                        "l'autre.\n");

        chapter128.addChoice(new Choice("Page 14", "14"));
        chapter128.addChoice(new Choice("Page 120", "120"));
        chapter128.addChoice(new Choice("Page 130", "130"));

        Chapter chapter129 = new Chapter("129", "",
                "129\n" +
                        "Comme c'est intéressant. La cassette contient une grande clef. Le coffre, en revanche,\n" +
                        "ne contient qu'un parchemin. Sur ce parchemin est inscrit :\n" +
                        "NPJ, FUIFMCFSU, NPJOF FU, N'FUBON MJF E'BNJUJF BWFD MF NPOTUSF B\n" +
                        "UFUF EF UBVSFBV BGGJSNF RVF TFVMF MB DMFG DPOUFOVF EBOT MF\n" +
                        "DPGGSFU QFVU QFSNFUUSF M'BDDFT B M'BOUSF EFT DSBDIFVST EF\n" +
                        "GFV.\n" +
                        "Ce qui n'éclaire guère votre lanterne, à moins que Vous ne réussissiez à déchiffrer le\n" +
                        "code. Comme l'avait prédit le Minotaure, les autres coffres ont disparu. Les passages\n" +
                        "partant de la grotte du Minotaure conduisent au 114, au 128 et au 137. Faites votre\n" +
                        "choix !\n");

        chapter129.addChoice(new Choice("Page 114", "114"));
        chapter129.addChoice(new Choice("Page 128", "128"));
        chapter129.addChoice(new Choice("Page 137", "137"));

        Chapter chapter130 = new Chapter("130", "",
                "130\n" +
                        "Ouaoh ! Ce doit être votre jour de chance, Pip. Le passage vient de déboucher dans\n" +
                        "une grotte, et votre torche illumine le plus fabuleux amas de joyaux, d'argent, d'or, de\n" +
                        "vermeil, de jade, d'ivoire, d'objets d'art, que vous ayez jamais vu. Il y a là la rançon\n" +
                        "d'un roi, un trésor qui dépasse les rêves les plus fous de l'avare le plus sordide.\n" +
                        "Comparée à cette caverne, la fameuse salle du trésor du Sorcier Ansalom ressemble à\n" +
                        "la guérite du caissier d'un cirque de troisième ordre. Il doit y avoir des millions ici,\n" +
                        "peut- être des milliards. Diamants, rubis, saphirs, émeraudes, zircons, perles... par\n" +
                        "centaines, par milliers, amassés là en un énorme tas, attendant qu'on les enfourne dans\n" +
                        "un sac à dos ! Ce doit être le légendaire Trésor du Dragon, les rançons extorquées\n" +
                        "contre la libération de jeunes filles enlevées, les trésors arrachés aux monastères ou\n" +
                        "aux châteaux mis au pillage, tout le butin rassemblé pendant des siècles par des\n" +
                        "générations de Dragons déchaînés. Tout est là, attendant simplement la venue d'un\n" +
                        "courageux aventurier tel que vous. Voilà qui pourrait changer radicalement votre\n" +
                        "façon de vivre, Pip. Avec ça, vous pourriez vous offrir un château... des douzaines de\n" +
                        "châteaux... Vous pourriez... Mais vous savez parfaitement ce que vous pourriez vous\n" +
                        "offrir Pour mettre la main sur ce trésor, ou du moins tout ce que vous pouvez porter,\n" +
                        "ce qui est déjà énorme, il vous suffit de persuader la dame à l'étrange chevelure de\n" +
                        "vous laisser vous servir. La dame à l'étrange chevelure ? Mais ce n'est pas des cheveux\n" +
                        "qu'elle a sur la tête, mais des serpents ! Serait-ce la Méduse, cette créature mythique\n" +
                        "dont un seul regard vous transforme en pierre ? A ce propos, d'ailleurs, plusieurs\n" +
                        "statutes d'un grand réalisme sont disséminées çà et là autour du trésor. Mais pensez à\n" +
                        "tout ce butin, Pip. Pensez à tout ce qu'il vous permettrai: d'obtenir.\n" +
                        "Pour emporter une partie de ce trésor, vous allez devoir combattre la Méduse. Si vous\n" +
                        "optez pour cette solution, rendez-vous au 136.\n" +
                        "Si vous estimez que la discrétion est l'essence même du courage (et qui a besoin d'un\n" +
                        "pareil butin, de toute façon ?), vous pouvez utiliser votre sortilège INVISIBILITÉ\n" +
                        "pour sortir de cette grotte sans être vu.\n" +
                        "Si vous ne voulez pas utiliser ici votre sortilège, vous pouvez essayer de vous défiler\n" +
                        "sur la pointe des pieds. Pour savoir si vous avez réussi, lancez deux dés. Si vous faites\n" +
                        "de 2 à 6, vous êtes sorti sans avoir été repéré. Si vous faites de 7 à 12, la Méduse jette\n" +
                        "un bref regard dans votre direction. Sans mot dire, vous vous rendez au 14.\n" +
                        "Les galeries permettant de sortir de cette caverne mènent au 138, et au 128.\n");

        chapter130.addChoice(new Choice("Page 136", "136"));
        chapter130.addChoice(new Choice("Page 14", "14"));
        chapter130.addChoice(new Choice("Page 138", "138"));
        chapter130.addChoice(new Choice("Page 128", "128"));

        Chapter chapter131 = new Chapter("131", "",
                "131\n" +
                        "Chacun de ces affreux Nains possède 10 POINTS DE VIE. Ils se déplacent avec une\n" +
                        "telle lenteur, que vous pouvez avoir, à coup sûr, l'initiative de l'attaque. Lancez deux\n" +
                        "dés pour savoir combien de Nains vous pourrez frapper avant qu'ils ne ripostent. (Si\n" +
                        "vous faites un double 6, cela signifie que vous pouvez tous les frapper.) Lorsque vous\n" +
                        "aurez porté votre premier coup, les Nains répliqueront à tour de rôle. Ils ne sont guère\n" +
                        "doués pour le combat, et il leur faut au minimum un 8 pour vous atteindre. En\n" +
                        "revanche, ils sont armés de redoutables épées qui infligent 3 Points de Dommage\n" +
                        "supplémentaires.\n" +
                        "Si les Nains vous font passer de vie à trépas, on vous attend au 14.\n" +
                        "Si vous réussissez à vous débarasser de dix d'entre eux, les deux autres s'enfuiront en\n" +
                        "direction de la grotte du Minotaure, vous laissant libre d'agir à votre guise dans cette\n" +
                        "caverne. Rendez-vous alors au 134.\n");

        chapter131.addChoice(new Choice("Page 14", "14"));
        chapter131.addChoice(new Choice("Page 134", "134"));

        Chapter chapter132 = new Chapter("132", "",
                "132\n" +
                        "GLOU... Glou... Glou... Glou... C'est vous qui faites ces bruits. En vous noyant. Vous\n" +
                        "voulez les entendre à nouveau ?\n" +
                        "Glou... Glou... Glou... Glou...\n" +
                        "Si vous vous noyez, c'est parce que le canot vient de\n" +
                        "couler. Que pouvez-vous faire, maintenant ?\n" +
                        "Votre sortilège AEP (si vous l'avez toujours, et si vous savez vous en servir) fera naître\n" +
                        "autour de vous une bulle suffisamment remplie d'air pour vous permettre de survivre\n" +
                        "assez longtemps pour gagner la rive. Rendez-vous au 124.\n" +
                        "par ailleurs, vous avez une vague chance d'apprendre à nager en un temps record\n" +
                        "(certains apprennent vite, lorsque la nécessité les y contraint). Lancez les dé\n" +
                        "exactement de la même façon que vous les avez lancés pour acquérir votre total de\n" +
                        "départ de POINTS DE VIE. Si le nombre que vous obtenez est supérieur a votre total de\n" +
                        "départ actuel, vous pouvez, d'une part le considérer dorénavant comme votre total de\n" +
                        "départ de POINTS DE VIE et, d'autre part, vous pouvez ajouter la natation sur la liste de\n" +
                        "vos multiples talents car, miracle, vous nagez comme un poisson.\n" +
                        "Enfin, vous pouvez faire appel à la chance : lancez deux dés. Si vous faites 11 ou 12,\n" +
                        "vous réussissez à gagner la rive en pataugeant tant bien que mal (vous pouvez utiliser\n" +
                        "une Piérre de Chance, si vous en possédez une).\n" +
                        "Si vous avez réussi à survivre à ce désastre par l'une ou l'autre de ces trois possibilités,\n" +
                        "rendez-vous au 124. Sinon, le 14, bien sûr.\n");

        chapter132.addChoice(new Choice("Page 124", "124"));
        chapter132.addChoice(new Choice("Page 14", "14"));

        Chapter chapter133 = new Chapter("133", "",
                "133\n" +
                        "Eh bien, au moins, vous n'êtes pas mort. Un peu estourbi peut-être, mais pas mort. Le\n" +
                        "seul problème, maintenant, c'est qu'il va falloir demander à Merlin de s'occuper de\n" +
                        "cette énorme et stupide tête du Minotaure.\n" +
                        "N'oublie pas ta promesse, dit le Minotaure. comme s'il lisait dans vos pensées.\n" +
                        "Et la seule façon pour vous de voir Merlin au cours de cette aventure, c'est de vous\n" +
                        "faire tuer. Ce qui esx quand même paradoxal, Pip.\n" +
                        "Et si... suggérez-vous d'une voix hésitante, si je vous promettais de parler à Merlin de\n" +
                        "votre petit problème la prochaine fois que je le verrai ? Je n'ai guère envie de refaire\n" +
                        "maintenant tout le voyage en sens inverse, parce que j'ai un Dragon à combattre, si je\n" +
                        "peux le trouver.\n" +
                        "Quand espères-tu le voir? demande le Minotaure, soupçonneux.\n" +
                        "La prochaine fois que je serai tué, répondez-vous en toute honnêteté.\n" +
                        "Cela ne devrait pas prendre bien longtemps dans un endroit pareil, fait remarquer le\n" +
                        "Minotaure. Je suis un monstre compréhensif. J'attendrai.\n" +
                        "Je vous remercie, Noble Minotaure, répondez- vous poliment.\n" +
                        "Et, ajoute le Minotaure dans un brusque élan de générosité, quand tu l'auras vu, tu\n" +
                        "pourras prendre le contenu de ma cassette. Et d'un geste impulsif, il vous place de\n" +
                        "force la cassette entre les mains.\n" +
                        "La cassette refusera de s'ouvrir, malgré tous vos efforts, avant que vous ne vous soyez\n" +
                        "une fois de plus rendu au 14 et que vous ayez vu Merlin. Mais lorsque vous aurez tenu\n" +
                        "votre promesse (et pas avant) vous pourrez vous rendre au 143 (notez le numéro) pour\n" +
                        "savoir ce que contient la cassette, avant de rejoindre le paragraphe auquel vous aurez\n" +
                        "rendez-vous. Vous avez bien compris ? Parfait.\n" +
                        "Trois passages peuvent vous permettre de quitter la grotte du Minotaure. Ils conduisent\n" +
                        "au 114, au 128 et au 137. Faites votre choix.\n");

        chapter133.addChoice(new Choice("Page 14", "14"));
        chapter133.addChoice(new Choice("Page 143", "143"));
        chapter133.addChoice(new Choice("Page 114", "114"));
        chapter133.addChoice(new Choice("Page 128", "128"));
        chapter133.addChoice(new Choice("Page 137", "137"));

        Chapter chapter134 = new Chapter("134", "",
                "134\n" +
                        "Enjambant avec soin les cadavres des Nains, vous arrivez devant le panneau de\n" +
                        "contrôle sur le mur nord. Une plaque de métal bleu est encastrée dans le sol en métal\n" +
                        "luisant sous vos pieds. Vous la tâtez avec précaution, mais il semble qu'on puisse se\n" +
                        "tenir dessus sans danger. Devant vous se trouvent trois grands leviers, surmontés d'une\n" +
                        "notice en rouge dont les termes sont les suivants :\n" +
                        "GLISSEZ LA CLEF DANS LA FENTE\n" +
                        "A VANT D'ACTIONNER LES LEVIERS\n" +
                        "A côté de la notice, vous distinguez une fente assez large pour qu'on puisse y loger\n" +
                        "une grande clef. Les leviers sont numérotés 1, 2 et 3. Vous constatez que chacun\n" +
                        "d'entre eux peut être poussé vers le haut ou rabattu vers le bas. Réfléchissez bien\n" +
                        "avant de décider ce que vous allez faire avec ces leviers car, de toute évidence, ils vont\n" +
                        "déterminer le cours futur de votre aventure. Divers choix s'offrent à vous :\n" +
                        "Si vous avez une clef à glisser dans la fente, voilà les résultats que vous pouvez\n" +
                        "obtenir : Poussez les trois leviers vers le haut et rendez-vous au 139.\n" +
                        "Rabattez les trois leviers vers le bas et rendez-vous au 141.\n" +
                        "Poussez un levier vers le haut et deux vers le bas et rendez-vous au 144.\n" +
                        "Poussez deux leviers vers le haut et un vers le bas et rendez-vous au 147.\n" +
                        "Si vous ne possédez pas de clef à glisser dans la fente, voici les résultats que vous\n" +
                        "pouvez obtenir : Poussez les trois leviers vers le haut et rendez-vous au 142.\n" +
                        "Rabattez tous les leviers vers le bas et rendez-vous au 145.\n" +
                        "Poussez un levier vers le haut et deux vers le bas et rendez-vous au 148.\n" +
                        "Poussez deux leviers vers le haut et un vers le bas et rendez-vous au 149.\n");

        chapter134.addChoice(new Choice("Page 139", "139"));
        chapter134.addChoice(new Choice("Page 141", "141"));
        chapter134.addChoice(new Choice("Page 144", "144"));
        chapter134.addChoice(new Choice("Page 147", "147"));
        chapter134.addChoice(new Choice("Page 142", "142"));
        chapter134.addChoice(new Choice("Page 145", "145"));
        chapter134.addChoice(new Choice("Page 148", "148"));
        chapter134.addChoice(new Choice("Page 149", "149"));

        Chapter chapter135 = new Chapter("135", "",
                "135\n" +
                        "Le coffre n° 3 contient un rouleau sur lequel est écrit :\n" +
                        "NPJ, FUIFMCFSU, NPJOF FU, N'FUBON MJF E'BNJUJF BWFD MF NPOTUSF B\n" +
                        "UFUF EF UBVSFBV BGGJSNF RVF TFVMF MB DMFG DPOUFOVF EBOT MF\n" +
                        "DPGGSFU QFVU QFSNFUUSF M'BDDFT B M'BOUSF EFT DSBDIFVST EF\n" +
                        "GFV.\n" +
                        "ce qui n'éclaire guère votre lanterne, à moins que vous ne parveniez à déchiffrer\n" +
                        "le code. Peut-être trouverez-vous quelque chose pour vous aider dans le coffre N°\n" +
                        "1. Vous l'ouvrez d'un geste rapide et vous êtes aussitôt mordu par un gros\n" +
                        "Serpent. Lancez deux dés pour savoir si le poison est mortel.\n" +
                        "Si vous faites de 2 à 4, le poison se répand dans vos veines comme un acide.\n" +
                        "Tordez-vous de douleur durant un instant, puis rendez-vous calmement au 14.\n" +
                        "Si vous faites de 5 à 12, vous jouissez d'une immunité naturelle. Rejetez ce\n" +
                        "Serpent imbécile dans son coffre et essayez de décoder le message. Comme le\n" +
                        "Minotaure l'avait prédit, les autres coffres ont disparu. Les passages depuis la\n" +
                        "grotte du Minotaure conduisent au 114, au 128 et au 137. Faites votre choix !\n");

        chapter135.addChoice(new Choice("Page 14", "14"));
        chapter135.addChoice(new Choice("Page 114", "114"));
        chapter135.addChoice(new Choice("Page 128", "128"));
        chapter135.addChoice(new Choice("Page 137", "137"));

        Chapter chapter136 = new Chapter("136", "",
                "136\n" +
                        "Quelle courageuse décision ! Un peu intéressée, peut-être, mais courageuse.\n" +
                        "Maintenant, passons aux mauvaises nouvelles. La Méduse dispose de 100 POINTS\n" +
                        "DE VIE. Elle peut vous transformer en pierre chaque fois qu'elle frappe deux\n" +
                        "coups d'affilée contre vous. Il lui faut faire au minimum 8 pour frapper un coup. Si\n" +
                        "vous décidez d'utiliser votre sortilège INVISIBILITÉ durant ce combat, elle peut\n" +
                        "quand même vous vaincre, mais il lui faudra frapper Trois coups d'affilée contre\n" +
                        "vous. Bonne chance !\n" +
                        "Si la Méduse vous tue, rendez-vous au 14. Si vous tuez la Méduse, vous\n" +
                        "constaterez que vous pouvez facilement porter un trésor qui vaut 200 000 Pièces\n" +
                        "d'Or.\n" +
                        "Deux passages permettent de sortir de cette grotte Ils conduisent au 138 et au 128.\n" +
                        "Choisissez bien !\n");

        chapter136.addChoice(new Choice("Page 14", "14"));
        chapter136.addChoice(new Choice("Page 138", "138"));
        chapter136.addChoice(new Choice("Page 128", "128"));

        Chapter chapter137 = new Chapter("137", "",
                "137\n" +
                        "La caverne dans laquelle vous venez de pénétrer est complètement tapissée de métal !\n" +
                        "Sol, murs et plafond ! Et le mur nord tout entier est occupé par des rangées et des\n" +
                        "rangées d'énormes machines. Elles ne peuvent en aucun cas être l'œuvre de Dragons !\n" +
                        "Ou de qui que ce soit d'autre ayant vécu du temps du roi Arthur. Si vous n'étiez pas un\n" +
                        "personnage du vingtième siècle occupant un autre corps, vous seriez peut-être tenté de\n" +
                        "penser qu'il s'agit là de magie Mais vous venez précisément du vingtième siècle, et\n" +
                        "vous savez très bien que vous avez devant vous une sorte de machine géante. Mais qui\n" +
                        "l'a fabriquée ? Comment est-elle arrivée ici ? Et à quoi sert-elle ? Quel mystère !\n" +
                        "Quelle énigme ! Quelle glorieuse occasion de fouiner par-ci par-là et de vous attirer\n" +
                        "ainsi les pires ennuis !\n" +
                        "Vous seriez sans doute fort tenté de vous diriger tout droit vers ce panneau de contrôle\n" +
                        "du mur nord, si vous n'étiez pas retenu par un petit détail. Douze Nains bossus (pas\n" +
                        "moins) à la mine menaçante s'affairent autour de toute cette machinerie. Douze ! Un\n" +
                        "aventurier, même de votre réputation et de votre expérience, peut-il les combattre tous\n" +
                        "? Vous seul le savez.\n" +
                        "Vous pouvez utiliser votre sortilège INVISIBILITÉ pour filer sain et sauf. Mais cela\n" +
                        "implique que vous repartiez par où vous êtes venu, puisque cet endroit ne comporte\n" +
                        "aucune autre sortie. Vous pouvez essayer de vous esquiver discrètement sur la pointe\n" +
                        "des pieds. Si c'est le cas, lancez deux dés. Si vous faites de 2 à 8, vous vous éclipsez\n" +
                        "sans que les Nains aient remarqué votre présence. Si vous faites de 9 à 12, ils vous ont\n" +
                        "repéré et se jettent sur vous en poussant des cris terrifiants, auquel cas le combat est\n" +
                        "inéluctable. Rendez-vous au 131. Vous pouvez vous ruer sur les Nains en espérant les\n" +
                        "mettre en pièces. Dans ce cas, rendez-vous au 131.\n");

        chapter137.addChoice(new Choice("Page 131", "131"));

        Chapter chapter138 = new Chapter("138", "",
                "138\n" +
                        "le passage s'élargit brusquement et vous vous retrouvez sur la berge rocheuse d'un\n" +
                        "vaste lac souterrain. Aucun chemin n'apparaît autour de ces eaux sombres, immobiles.\n" +
                        "Mais, amarré à quelques metres de vous, flotte un vieux canot à rames disloqué.\n" +
                        "Si vous avez découvert précédemment au cours de cette aventure que vous savez\n" +
                        "nager, peut-être aurez- vous envie de vous baigner dans ce lac. Rendez-vous\n" +
                        "alors au 123. Si vous ignorez si vous savez nager, NE prenez pas ce risque.\n" +
                        "Si vous voulez vous hasarder dans le canot qui, manifestement, fait eau, il vous\n" +
                        "emmènera, par UN tunnel, jusqu'au 102.\n");

        chapter138.addChoice(new Choice("Page 123", "123"));
        chapter138.addChoice(new Choice("Page 102", "102"));

        Chapter chapter139 = new Chapter("139", "",
                "139\n" +
                        "On entend un ronronnement de machine. Une vibration vous parcourt le corps.\n" +
                        "Pendant un instant vous vous sentez étourdi, désorienté. Une spirale de lumière jaillit\n" +
                        "de la plaque, sous vos pieds, et s'ecroule autour de vous. La tête vous tourne, le vertige\n" +
                        "s'amplifie... Puis, c'est l'obscurité. Vous vous retrouvez dans un couloir souterrain en\n" +
                        "pierres maçonnées, bien éclairé par des torches disposées dans des appliques fixées sur\n" +
                        "les parois à intervalles réguliers. La caverne de métal a disparu. En fait vous vous\n" +
                        "retrouvez face à trois couloirs orientés vers le nord-ouest, le nord et le nord-est. Tous\n" +
                        "trois sont obscurs, et ne vous inspirent guère confiance Dans le couloir nord-ouest,\n" +
                        "vous remarquez les premières marches d'un escalier qui semble s'enfoncer\n" +
                        "profondément dans le roc. Il vous faut prendre rapidement une décision. Allez-vous\n" +
                        "vous diriger :\n" +
                        "vers le nord-ouest ? Rendez-vous au 141\n" +
                        "vers le nord ? Rendez-vous au 151\n" +
                        "vers le nord-est ? Rendez-vous au 154\n");

        chapter139.addChoice(new Choice("Page 141", "141"));
        chapter139.addChoice(new Choice("Page 151", "151"));
        chapter139.addChoice(new Choice("Page 154", "154"));

        Chapter chapter140 = new Chapter("140", "",
                "140\n" +
                        "Oh misère. Vous venez d'être mordu par un Serpent qui était enroulé au fond du coffre\n" +
                        "n° 1. (Non, ne rrenez pas vos dés, ne vous tordez pas de douleur ce n'est pas tout).\n" +
                        "Heureusement, comme tout excentrique sensé, vous avez ouvert en premier le coffre\n" +
                        "n° 2. A l'intérieur se trouvait un petit flacon portant clairement l'inscription : Antidote\n" +
                        "au venin de Serpent. En toute hâte, vous lampez cet antidote (qui a un goût infect) et,\n" +
                        "en quelques instants, vous vous sentez beaucoup mieux. Le 14 avec ses perspectives\n" +
                        "fatales s'efface à l'horizon. Comme le Minotaure l\"avait prédit, les autres coffres et la\n" +
                        "cassette ont disparu. Rien d'autre à faire que de partir.\n" +
                        "les passages qui permettent de sortir de la grotte du Minotaure conduisent au 137, au\n" +
                        "114 et au 128. Faites votre choix !\n");

        chapter140.addChoice(new Choice("Page 137", "137"));
        chapter140.addChoice(new Choice("Page 114", "114"));
        chapter140.addChoice(new Choice("Page 128", "128"));

        Chapter chapter141 = new Chapter("141", "",
                "141\n" +
                        "Obscurité totale. Et, dans cette obscurité, quelque chose se jette sur vous. Une énorme\n" +
                        "créature très agressive, et semble-t-il velue. Des crocs claquent à vous frôler la gorge.\n" +
                        "Des griffes vous labourent la poitrine. Des grondements féroces vous font vibrer les\n" +
                        "tympans. En somme, vous voilà avec un autre combat sur les bras.\n" +
                        "Le Monstre (quoi d'autre?) dispose de 80 POINTS DE VIE. Il porte le premier coup\n" +
                        "contre vous, et il lui suffit de faire 5, au minimum, pour vous toucher Chacun de ses\n" +
                        "coups vous infligera 2 Points de Dommage supplémentaires. Défendez-vous, Pip !\n" +
                        "Si le Monstre remporte le combat, rendez-vous au 14.\n" +
                        "Si vous êtes vainqueur, rendez-vous au 152.\n");

        chapter141.addChoice(new Choice("Page 14", "14"));
        chapter141.addChoice(new Choice("Page 152", "152"));

        Chapter chapter142 = new Chapter("142", "",
                "142\n" +
                        "On entend un ronronnement de machine. Une vibration vous parcourt le corps.\n" +
                        "Pendant un instant vous vous sentez étourdi, désorienté. Une spirale de lumière jaillit\n" +
                        "de la plaque, sous vos pieds, et s'enroule autour de vous. La tête vous tourne. Le ver-\n" +
                        "tige s'amplifie... Puis, c'est l'obscurité. Rendez-vous au 14.\n");

        chapter142.addChoice(new Choice("Page 14", "14"));

        Chapter chapter143 = new Chapter("143", "",
                "143\n" +
                        "La cassette contient une grosse clef qui pourrait vous être utile si vous survivez à la\n" +
                        "morsure du Serpent lové au fond du coffre n° 3. Lancez deux dés pour savoir si la\n" +
                        "morsure du Serpent est mortelle.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 5 : rendez-vous au 14.\n" +
                        "de 6 à 12 : vous pouvez garder la clef, et vous ne perdez pas de POINTS DE VIE.\n" +
                        "Comme l'avait prédit le Minotaure, les autres coffres ont disparu. Trois passages\n" +
                        "permettent de sortir de cette caverne. Ils conduisent au 137, au 114 et au 128.\n" +
                        "Choisissez bien !\n");

        chapter143.addChoice(new Choice("Page 14", "14"));
        chapter143.addChoice(new Choice("Page 137", "137"));
        chapter143.addChoice(new Choice("Page 114", "114"));
        chapter143.addChoice(new Choice("Page 128", "128"));

        Chapter chapter144 = new Chapter("144", "",
                "144\n" +
                        "Rendez-vous au 108.\n");

        chapter144.addChoice(new Choice("Page 108", "108"));

        Chapter chapter145 = new Chapter("145", "",
                "145\n" +
                        "On entend un ronronnement de machine. Une vibration vous parcourt le corps.\n" +
                        "Pendant un instant, vous vous sentez étourdi, désorienté. Une spirale de lumière jaillit\n" +
                        "de la plaque sous vos pieds et s'enroule autour de vous. La tête vous tourne. Le vertige\n" +
                        "s'amplifie... Puis c'est l'obscurité. Rendez-vous au 14.\n");

        chapter145.addChoice(new Choice("Page 14", "14"));

        Chapter chapter146 = new Chapter("146", "",
                "146\n" +
                        "Le coffre n° 2 contient un flacon où se lit clairement l'inscription : Antidote au venin\n" +
                        "de Serpent, qui pourrait se révéler utile en cas de morsure de Serpent. Il y en a\n" +
                        "suffisament pour une dose, qui neutralisera complètement le venin, vous laissant le\n" +
                        "total de POINTS DE VIE dont vous disposiez avant d'être mordu.\n" +
                        "Le coffre n° 3 contient un rouleau sur lequel est écrit :\n" +
                        "NPJ, FUIFMCFSU, NPJOF FU, N'FUBON MJF E'BNJUJF BWFD MF NPOTUSF B\n" +
                        "UFUF EF UBVSFBV BGGJSNF RVF TFVMF MB DMFG DPOUFOVF EBOT MF\n" +
                        "DPGGSFU QFVU QFSNFUUSF M'BDDFT B M'BOUSF EFT DSBDIFVST EF\n" +
                        "GFV.\n" +
                        "Ce qui n'éclaire guère votre lanterne, à moins que vous ne parveniez à déchiffrer le\n" +
                        "code. (Et encore !) Comme l'avait prédit le Minotaure, les autres coffres ont disparu.\n" +
                        "Les passages pour sortir de la grotte du Minotaure conduisent au 114, au 128 et au\n" +
                        "137. Faites votre choix !\n");

        chapter146.addChoice(new Choice("Page 114", "114"));
        chapter146.addChoice(new Choice("Page 128", "128"));
        chapter146.addChoice(new Choice("Page 137", "137"));

        Chapter chapter147 = new Chapter("147", "",
                "147\n" +
                        "On entend un ronronnement de machine. Une vibration vous parcourt le corps.\n" +
                        "Pendant un instant, vous vous sentez étourdi, désorienté. Une spirale de lumière jaillit\n" +
                        "de la plaque, sous vos pieds, et s'enroule autour de vous. La tête vous tourne. Le\n" +
                        "vertige s'amplifie. Puis c'est l'obscurité. Rendez-vous au 108.\n");

        chapter147.addChoice(new Choice("Page 108", "108"));

        Chapter chapter148 = new Chapter("148", "",
                "148\n" +
                        "On entend un ronronnement de machine. Une vibra- non vous parcourt le corps.\n" +
                        "Pendant un instant, vous vous sentez étourdi, désorienté. Une spirale de lumière jaillit\n" +
                        "de la plaque sous vos pieds et s'enroule autour de vous. La tête vous tourne. Le vertige\n" +
                        "s'amplifie... Puis c'est l'obscurité. Rendez-vous au 14.\n");

        chapter148.addChoice(new Choice("Page 14", "14"));

        Chapter chapter149 = new Chapter("149", "",
                        "149\n" +
                        "On entend un ronronnement de machine. Une vibra- non vous parcourt le corps.\n" +
                        "Pendant un instant, vous vous sentez étourdi, désorienté. Une spirale de lumière jaillit\n" +
                        "de la plaque sous vos pieds et s'enroule autour de vous. La tête vous tourne. Le vertige\n" +
                        "s'amplifie... Puis c'est l'obscurité. Rendez-vous au 14.\n");

        chapter149.addChoice(new Choice("Page 14", "14"));

        Chapter chapter150 = new Chapter("150", "",
                "150\n" +
                        "La cassette contient une grosse clef. A quoi peut-elle bien correspondre ? Le coffre ne\n" +
                        "fournit aucune explication : il contient seulement un flacon avec l'inscription\n" +
                        "clairement indiquée Antidote au venin de Serpent, ce qui, au moins, pourrait se révéler\n" +
                        "utile en cas de morsure de Serpent. Son goût est infect, mais il neutralise totalement le\n" +
                        "venin. Il vous laissera les POINTS DE VIE dont vous disposiez avant d'être mordu. Le\n" +
                        "flacon ne contient qu'une seule dose. Comme le Minotaure l'avait prédit, les autres cof-\n" +
                        "fres ont disparu. Trois passages permettent de sortir de cette caverne. Ils conduisent au\n" +
                        "114, au 137 et au 128. Faites votre choix !\n");

        chapter150.addChoice(new Choice("Page 114", "114"));
        chapter150.addChoice(new Choice("Page 137", "137"));
        chapter150.addChoice(new Choice("Page 128", "128"));

        Chapter chapter151 = new Chapter("151", "",
                "151\n" +
                        "La galerie que vous suivez maintenant, est creusée à même le roc, et donne plutôt\n" +
                        "l'impression d'une fissure naturelle, élargie par endroits pour faciliter le passage.\n" +
                        "Tandis que vous progressez dans ce passage, une pensée vous vient à l'esprit. Quelle\n" +
                        "que soit la raison de la présence de cette invraisemblable machine à l'époque du roi\n" +
                        "Arthur, il est évident qu'elle vous a expédié ailleurs, et qu'il vous est impossible de\n" +
                        "revenir sur vos pas. Qu'importe après tout ! Un aventurier courageux doit toujours aller\n" +
                        "de l'avant. Et c'est précisément ce que vous faites : soudain, une nouvelle caverne se\n" +
                        "présente à vous. Vous avez un instant d'hésitation, car elle est totalement différente de\n" +
                        "celles que vous avez visitées jusqu'à présent. On dirait qu'elle a été formée de roches\n" +
                        "liquides, car ses parois sont lisses, et sa forme évoque celle d'un gigantesque\n" +
                        "entonnoir. Vous avancez avec précaution. La pente est de plus en plus raide, et la\n" +
                        "caverne se rétrécit autour de vous. Tous les sens en alerte, vous progressez maintenant\n" +
                        "pas à pas, et... oh, non ! le fond de la caverne est obstrué par un énorme rocher ! Que\n" +
                        "faire ? Apparemment, le rocher semble impossible à déplacer.\n" +
                        "Vous pouvez lancer les dés, mais une seule fois. Si vous obtenez 10, 11 ou 12, le\n" +
                        "rocher n'est pas aussi pesant que vous l'imaginiez, et vous parvenez à le faire basculer\n" +
                        "sur le côté.\n" +
                        "Si vous ne sortez pas ces chiffres, une Boule de Feu peut dégager le passage. S'il ne\n" +
                        "vous reste plus de Boules de Feu, ou si vous préférez ne pas en utiliser ici, vous\n" +
                        "pouvez vous servir d'une baguette magique (si vous en avez trouvé une). Elle\n" +
                        "dissoudra lentement le bloc de rocher, et le transformera en boue... mais au prix\n" +
                        "exorbitant de 25 POINTS DE VIE. Vous pouvez perdre la vie dans cette affaire :\n" +
                        "aussi, avant d'agiter la baguette, vérifier bien votre total de POINTS DE VIE, pour ne\n" +
                        "pas échouer, une fois de plus, au 14.\n" +
                        "Dès que vous aurez réussi à franchir cet obstacle, rendez-vous au 153. Sinon,\n" +
                        "impossible de faire demi- tour : les parois de la caverne sont trop lisses, et la pente\n" +
                        "trop abrupte. Vous allez vous ennuyer un bon moment dans ce sinistre lieu, avant de\n" +
                        "vous retrouver au 14\n");

        chapter151.addChoice(new Choice("Page 153", "153"));
        chapter151.addChoice(new Choice("Page 14", "14"));

        Chapter chapter152 = new Chapter("152", "",
                "152\n" +
                        "Il se produit une chose vraiment étrange : maintenant que le Monstre est mort,\n" +
                        "l'obscurité se dissipe, vous permettant de distinguer ce qui vous entoure. Comme si, de\n" +
                        "son vivant, le Monstre avait absorbé la lumière. Et, en effet, une zone d'obscurité\n" +
                        "demeure sur le sol. Lorsque vous y plongez la main, vous sentez au bout des doigts\n" +
                        "une peau velue, des serres ; vous devinez la forme d'un corps. Il semblerait que vous\n" +
                        "ayez exterminé une sorte de Monstre des Ténèbres. Vraiment bizarre. Mais assez\n" +
                        "philosophé. La salle dans laquelle vous vous trouvez (il s'agit véritablement d'une\n" +
                        "salle, et non d'une caverne), est plutôt Spartiate d'aspect. Il y a un tas de foin dans un\n" +
                        "coin, où devait sans doute dormir le Monstre des Ténèbres avant que vous ne\n" +
                        "l'endormiez à jamais. A part cela et une écuelle, rien d'autre. A l'exception de la\n" +
                        "baguette magique, bien sur.\n" +
                        "Cette baguette, prolongée d'une petite courroie en cuir à une extrémité, est accrochée à\n" +
                        "un clou sur le mur ouest. Elle est en ébène et se termine par une pointe en jade. En la\n" +
                        "touchant, vous ressentez le frémissement électrique révélateur d'un puissant pouvoir\n" +
                        "magique, mais vous avez beau l'agiter ou la pointer, vous n'obtenez aucun résultat\n" +
                        "tangible. N'importe, une baguette magique est une baguette magique, et la magie c'est\n" +
                        "la magie. Vous la glissez donc dans votre sac, espérant qu'elle vous sera peut- être\n" +
                        "utile par la suite. Une seule issue permet de quitter la salle. Elle s'ouvre sur un passage\n" +
                        "étroit orienté vers l'est. Vous le suivez sur une courte distance et vous arrivez bientôt\n" +
                        "devant une porte qui s'ouvre sans difficulté. Vous êtes maintenant dans une galerie\n" +
                        "orientée nord-sud. Derrière vous, la porte s'est refermée, et semble avoir complètement\n" +
                        "disparu dans la paroi rocheuse. Vous décidez de poursuivre votre chemin vers le nord.\n" +
                        "Rendez-vous au 151.\n");

        chapter152.addChoice(new Choice("Page 151", "151"));

        Chapter chapter153 = new Chapter("153", "",
                "153\n" +
                        "Un court passage, orienté vers le sud-est, aboutit brusquement au sommet d'une volée\n" +
                        "de marches. Taillées grossièrement, — très grossièrement — elles sont maintenant\n" +
                        "lisses et usées comme si d'innombrables pieds les avaient foulées durant des éternités.\n" +
                        "Mais quels pieds ? Certainement pas ceux d'aventuriers, car seul un aventurier robuste,\n" +
                        "courageux et intelligent a pu survivre assez longtemps pour parvenir jusqu'ici ; ces\n" +
                        "êtres-là sont rares. Non, Pip. Ces marches ont été usées par quelque créature des\n" +
                        "cavernes, par quelque maléfique créature des ténèbres. Avez-vous perçu un son, au-\n" +
                        "dessous de vous? Un son ténu, sinistre. Un frôlement... La créature qui monte en\n" +
                        "rampant le long des marches a plus de deux mètres de long. Verte, les yeux rouge\n" +
                        "sang, elle darde furieusement devant elle une langue effilée, une très longue langue\n" +
                        "palpitante, qui se termine par un bulbe. Clac ! La langue se détend comme un fouet\n" +
                        "dans votre direction. Lancez deux dés pour savoir si vous êtes assez rapide pour\n" +
                        "l'éviter.\n" +
                        "Si vous faites :\n" +
                        "de 2 à 8 : vous avez réussi à l'éviter, de 9 à 12 : la langue s'enroule autour de vous, et\n" +
                        "vous attire inéluctablement vers une gueule béante Prenez le temps d'être digéré, puis\n" +
                        "rendez-vous au 14.\n" +
                        "Même si vous avez échappé à la langue du monstre, vous n'êtes pas pour autant sorti\n" +
                        "de l'auberge ! Cela vous donne simplement l'occasion de combattre le Rampant (le\n" +
                        "propriétaire de la langue). La créature ne possède pas plus de 20 POINTS DE VIE,\n" +
                        "mais si elle réussit à frapper un seul coup, vous êtes pris au piège, et digéré. Le\n" +
                        "Rampant réussit à porter un coup s'il sort, au minimum, un 8... Si vous perdez la vie au\n" +
                        "cours du combat, rendez- vous au 14.\n" +
                        "Si vous tuez le Rampant (et bon débarras, si vous y parvenez), rendez-vous au 154.\n");

        chapter153.addChoice(new Choice("Page 14", "14"));
        chapter153.addChoice(new Choice("Page 154", "154"));

        Chapter chapter154 = new Chapter("154", "",
                "154\n" +
                        "Vous descendez prudemment les marches pour déboucher dans une salle de dimension\n" +
                        "moyenne. manifestement créée par l'homme, mais voilà certainement des siècles et,\n" +
                        "semble-t-il abandonnée depuis longtemps. Des lambeaux de porte pourrie sont restés\n" +
                        "accrochés au chambranle. Le plafond disparaît à demi sous les toiles d'araignées. Une\n" +
                        "issue située au nord-est, s'ouvre sur un autre passage, dont le sol descend en pente.\n" +
                        "Mais, entre vous et la sortie, se trouvent des objets d'un intérêt considérable : un coffre\n" +
                        "vétuste, mais bien conservé, et un rouleau de parchemin, plus récent semble-t-il qui a\n" +
                        "roulé jusqu'à l'entrée du passage...\n" +
                        "Si vous désirez lire d'abord ce qui peut être écrit sur le parchemin, rendez-vous au 170.\n" +
                        "Si vous désirez ouvrir d'abord le coffre, rendez-vous au 156.\n");

        chapter154.addChoice(new Choice("Page 170", "170"));
        chapter154.addChoice(new Choice("Page 156", "156"));

        Chapter chapter155 = new Chapter("155", "",
                "155\n" +
                        "C'est une impasse ! Auriez-vous cru quelqu'un capable de vous jouer un tour pareil !\n" +
                        "Tracer sur une carte un itinéraire qui aboutit à une impasse ! Vous qui avez peiné\n" +
                        "durant des kilomètres pour arriver Là ! il est à craindre que la seule solution soit de\n" +
                        "refaire tout ce trajet en sens inverse, et d'essayer un autre itinéraire.\n");

        chapter155.addChoice(new Choice("Carte du Village", "10"));

        Chapter chapter156 = new Chapter("156", "",
                "156\n" +
                        "Le coffre est cerclé de cuivre, et fermé par un moraillon. Un motif décoratif en feuille\n" +
                        "d'or est incrusté dans le couvercle, autour d'un gros rubis. Il semble qu'il y ait\n" +
                        "différentes façons possibles d'ouvrir ce coffre, Pip.\n" +
                        "Vous pouvez, par exemple, simplement rabattre le moraillon, et essayer de soulever le\n" +
                        "couvercle. Si vous voulez ouvrir le coffre ainsi, rendez-vous au 171.\n" +
                        "Vous pouvez, par ailleurs, estimer qu'un coffre de ce genre, dont le contenu doit revêtir\n" +
                        "une extrême importance, doit posséder une serrure secrète, probablement déclenchée\n" +
                        "par le joyau incrusté dans le couvercle. Si vous voulez essayer de manœuvrer le rubis,\n" +
                        "rendez-vous au 164.\n" +
                        "Ou peut-être êtes-vous trop impatient pour vous livrer à des manipulations aussi\n" +
                        "subtiles : vous pouvez vous servir de votre épée pour forcer la serrure Si telle est la\n" +
                        "solution que vous choisissez, rendez- vous au 169.\n");

        chapter156.addChoice(new Choice("Page 171", "171"));
        chapter156.addChoice(new Choice("Page 164", "164"));
        chapter156.addChoice(new Choice("Page 169", "169"));

        Chapter chapter157 = new Chapter("157", "",
                "157\n" +
                        "Vous voilà bien agressif, n'est-ce pas ? Eh bien, puisque vous avez décidé d'attaquer,\n" +
                        "c'est vous qui frappez en premier ces petites horreurs. Ce qui vaut peut-être mieux pour\n" +
                        "vous.\n" +
                        "Chaque Forme ne possède que 4 POINTS DE VIE. Un seul coup peut donc la tuer.\n" +
                        "Mais le problème, c'est que si vous ne vous en débarrassez pas du premier coup, La\n" +
                        "Forme va pénétrer dans votre corps, et s'y fondre lentement, vous faisant perdre 15\n" +
                        "POINTS DE VIE ! Bien entendu, elle se détruit alors d'elle-même, mais c'est une\n" +
                        "piètre consolation, n'est-ce pas ? Les Formes attaquent à tour de rôle, et n'oubliez pas\n" +
                        "qu'elles sont au nombre de six. Bonne chance !\n" +
                        "Si vous sortez vainqueur de ce combat, rendez-vous au 162. Sinon, rendez-vous au 14.\n");

        chapter157.addChoice(new Choice("Page 162", "162"));
        chapter157.addChoice(new Choice("Page 14", "14"));

        Chapter chapter158 = new Chapter("158", "",
                "158\n" +
                        "Le résultat paraît satisfaisant : les toiles d'araignées ont disparu. Rendez-vous au 165.\n");

        chapter158.addChoice(new Choice("Page 165", "165"));

        Chapter chapter159 = new Chapter("159", "",
                "159\n" +
                        "Le résultat paraît satisfaisant : les toiles d'araignées ont disparu. Rendez-vous au 165.\n");

        chapter159.addChoice(new Choice("Page 165", "165"));

        Chapter chapter160 = new Chapter("160", "",
                "160\n" +
                        "Vous armant de tout votre courage, vous faites quelques pas, et vous pénétrez dans la\n" +
                        "plus étrange des cavernes que vous ayez visitées jusqu'alors. D'extraordinaires\n" +
                        "structures cristallines incrustées dans toute la surface de ses parois scintillent douce-\n" +
                        "ment à la lumière de votre torche, projetant des ombres aux reflets de saphir et\n" +
                        "d'émeraude ondulant comme des flammes magiques. L'espace est immense, et le sol\n" +
                        "descend en une série de gradins de faible hauteur, tel un escalier construit pour le plus\n" +
                        "gigantesque des géants. Le dernier des gradins s'incurve vers le nord, se rétrécissant en\n" +
                        "une espèce d'entonnoir dont l'extrémité s'élève brusquement, pour former une\n" +
                        "cheminée débouchant certainement à l’air libre. Et toute l'atmosphère de ce lieu\n" +
                        "sinistre est imprégnée d'une âcre puanteur qui vous suffoque à demi.\n" +
                        "Soudain, une flamme jaillit, qui illumine l'espace d'un instant l'ensemble de la\n" +
                        "caverne. Le spectacle qui s'est offert à vous durant ces quelques secondes vous glace\n" +
                        "le sang : la caverne grouille de Dragons ! il y en a partout : des douzaines, des\n" +
                        "centaines, nichés dans les anfractuosités, perchés sur des corniches rocheuses au-\n" +
                        "dessus de votre tête, plaqués aux parois irrégulières, tels des chauves-souris de cau-\n" +
                        "chemar. Et leurs yeux rouges surveillent le moindre de vos mouvements. Même\n" +
                        "l'Ordre des Chevaliers de la Table Ronde au complet ne pourrait venir à bout de cette\n" +
                        "engeance monstrueuse. Même les puissants pouvoirs magiques que recèle le Globe\n" +
                        "pour lequel vous avez risqué votre vie ne suffiraient sans doute pas à les tenir en\n" +
                        "respect. Votre instinct vous crie de vous enfuir... mais la fuite est impossible ! Car\n" +
                        "devant vous, sur la marche la plus basse, accroupi lourdement à côté d'une boule de\n" +
                        "cristal rouge sang coiffant une colonne de marbre, gigantesque, impassible, se trouve\n" +
                        "le monstre que vous avez pour mission de tuer. LE DRAGON DE BRONZE ! Il lève\n" +
                        "ses yeux d'ambre étincelants et vous fixe jusqu'au tréfonds de l'âme. Sssss ! Une petite\n" +
                        "langue de feu bleu-vert jaillit de sa gueule. Au même moment, des mots résonnent\n" +
                        "silencieusement en vous.\n" +
                        "Sois le bienvenu, Pip, aventurier et fidèle serviteur de l'Enchanteur Merlin !\n" +
                        "Vous ressentez un coup au cœur. C'est de la télépathie ! Un dragon télépathe ! Aucun\n" +
                        "texte n'a jamais fait mention de cela !\n" +
                        "Ce n'est pas le Dragon, Pip. C'est moi qui te parle. D'esprit à esprit.\n" +
                        "Stupéfait, vous jetez des regards affolés de tous côtés. Et, oubliant la multitude des\n" +
                        "Dragons qui vous entourent, vous hurlez :\n" +
                        "• Qui êtes vous ? Où êtes-vous ?\n" +
                        "Je suis Ethelbert, Moine Guerrier, Pip, un aventurier tout comme toi, mais en proie à\n" +
                        "la mauvaise fortune. Quant au lieu où je me trouve, la volonté divine a permis à ce\n" +
                        "monstre infernal de se livrer à une étrange opération magique par laquelle il a\n" +
                        "emprisonné mon âme dans cette infâme boule de cristal placée sur ce piedestal devant\n" +
                        "toi. Je suis condamné à y demeurer à jamais, à moins que tu n'aies la force d'égorger\n" +
                        "cette bête répugnante et de fracasser le cristal pour me délivrer.\n" +
                        "Mais comment m'y prendre pour tuer le Dragon de Bronze ? demandez-vous avec\n" +
                        "angoisse car en vérité, le peu d'assurance qui vous animait tend à vous abandonner.\n" +
                        "Grâce à la magie, valeureux Pip ! La magie et la robustesse de tes bras. D'étranges\n" +
                        "forces se sont répandues dans Avalon depuis que les Portes du sinistre Royaume des\n" +
                        "Morts ont été ouvertes par ce monstre. Mais j'ai toute confiance en toi, Pip. Espère\n" +
                        "en Dieu et frappe résolument à la tête quand tu affronteras la bête immonde. Mais,\n" +
                        "pour commencer, tu dois te mesurer aux Dragons de moindre importance. Puisse ton\n" +
                        "Globe mystique te protéger.\n" +
                        "Et il a raison, vous savez, Pip. Avant de courir le risque de vous faire tuer par le\n" +
                        "Dragon de Bronze, il va falloir venir à bout de ces centaines de Dragons qui vous\n" +
                        "entourent. Alors lancez les dés, et tout de suite, avant que vos nerfs ne vous\n" +
                        "trahissent.\n" +
                        "Si vous faites :\n" +
                        "de 1 à 9 : rendez-vous au 163.\n" +
                        "de 10 à 12 : rendez-vous au 166.\n");

        chapter160.addChoice(new Choice("Page 163", "163"));
        chapter160.addChoice(new Choice("Page 166", "166"));

        Chapter chapter161 = new Chapter("161", "",
                "161\n" +
                        "Fâcheuse initiative ! Vous voilà pris dans les toiles d'araignées, et sans aucun moyen\n" +
                        "d'y échapper. Alors, autant vous rendre immédiatement au 14.\n");

        chapter161.addChoice(new Choice("Page 14", "14"));

        Chapter chapter162 = new Chapter("162", "",
                "162\n" +
                        "Regardez, Pip ! Il y a un Globe au fond du coffre ! Il repose sur un coussin de velours\n" +
                        "pourpre, à côté d'une petite plaque de cuivre polie portant une inscription. Penchez-\n" +
                        "vous pour la déchiffrer !\n" +
                        "LE GLOBE DU MAITRE DES DRAGONS\n" +
                        "Tous les lézards cracheurs de feu sont soumis au pouvoir du Globe. Soufflez sur lui : si\n" +
                        "vous êtes un véritable Maître des Dragons, aucun cracheur de feu d'une espèce\n" +
                        "commune ne vous attaquera. Si vous n 'êtes pas un Maître des Dragons, peut-être le\n" +
                        "Globe vous protéger a-t-il, mais vous n'en aurez la certitude qu'après l'avoir mis à\n" +
                        "l'épreuve. Si le cracheur de feu appartient à une espèce magique, Dragon d'Argent,\n" +
                        "d'Or, d'Ebène ou de Bronze, le Globe restera sans pouvoir. Même s'il est entre les\n" +
                        "mains d'un Maître.\n" +
                        "Quelle trouvaille ! Dommage que vous ne soyez pas un Maître des Dragons. Mais du\n" +
                        "moins maintenant, avez-vous une chance d'échapper à la plupart des Dragons que vous\n" +
                        "pourrez rencontrer, avant d'affronter le monstre de bronze. Vous prenez donc déli-\n" +
                        "catement le Globe, et vous le rangez avec soin dans votre sac, vous demandant qui en\n" +
                        "fut l'artisan, et de quelle race pouvaient être ces Maîtres des Dragons, dont personne\n" +
                        "n'a jamais entendu parler dans l'Avalon du roi Arthur.\n" +
                        "Vous fouillez encore le coffre, puis la salle, le plus minutieusement possible, mais sans\n" +
                        "rien trouver d'autre qui vous intéresse. Vous vous dirigez alors vers l'entrée du tunnel\n" +
                        "qui semble descendre en pente abrupte dans les entrailles de la terre. Bien qu'il diffère\n" +
                        "peu des autres tunnels que vous avez suivis jusqu'à présent, votre instinct, affiné par\n" +
                        "tous les dangers que vous avez déjà affrontés, vous avertit que vous approchez enfin\n" +
                        "du but. Et il semble bien que vous ne vous trompiez pas, car l'âcre puanteur des\n" +
                        "Dragons se renforce. Bientôt, vous apercevez devant vous une faible lueur, qui se\n" +
                        "transforme rapidement en un cercle de pâle lumière marquant l'entrée d'une nouvelle\n" +
                        "caverne. Au-delà, vous entendez comme un léger bruissement : le bruissement feutré\n" +
                        "des ailes des Dragons. Rendez-vous au 160.\n");

        chapter162.addChoice(new Choice("Page 160", "160"));

        Chapter chapter163 = new Chapter("163", "",
                "163\n" +
                        "Sans perdre un instant, vous sortez le Globe de votre sac, et vous soufflez dessus. Il\n" +
                        "semble d'abord se troubler, puis il se met à flamboyer d'une éblouissante lumière\n" +
                        "mauve. Un vaste bruissement d'ailes retentit alors au-dessus de vous : de toute\n" +
                        "évidence, le phénomène a dérangé les monstres. Vous respirez profondément et, le\n" +
                        "cœur battant, vous vous avancez à pas comptés dans la caverne. Le Globe va-t-il vous\n" +
                        "protéger? Si la magie échoue, votre force, votre expérience et les sortilèges qui vous\n" +
                        "restent ne vous aideront que momentanément contre les énormes créatures qui vont\n" +
                        "fondre sur vous.\n" +
                        "Les Dragons, nerveux, s'agitent, vous fixant d'un regard intense. Mais vous atteignez\n" +
                        "l'extrémité de la première marche sans qu'ils aient autrement réagi, et vous avancez sur\n" +
                        "la marche suivante. Le Dragon de Bronze demeure impassible, comme vous en avait\n" +
                        "averti l'inscription figurant sur la plaque de cuivre. Du moins n'esquisse-t-il aucun\n" +
                        "mouvement dans votre direction, attendant sans aucun doute que vous soyez arrivé à sa\n" +
                        "hauteur. Vous hésitez quelque peu, et vous levez la tête. Les yeux des Dragons luisent\n" +
                        "férocement, reflétant la lumière mauve du Globe. Soudain l'un d'eux prend son élan\n" +
                        "d'une corniche, et se laisse tomber dans votre direction. Mais rapidement, il déploie ses\n" +
                        "ailes et, amorçant un virage, regagne son perchoir. Vous êtes maintenant au bout du\n" +
                        "deuxième degré, et vous descendez sur le suivant. Dans votre main, le Globe semble\n" +
                        "émettre maintenant un faible son... mais oui ! une légère musique se répète en écho\n" +
                        "dans toute la caverne. Deux par deux, les yeux qui vous épiaient commencent à\n" +
                        "s'alourdir, puis se ferment ! Les uns après les autres, les grands Dragons glissent la tête\n" +
                        "sous leur aile et s'endorment. Le pouvoir magique du Globe a opéré ! Et vous pouvez\n" +
                        "concentrer toute votre attention sur le monstre qui vous attend patiemment, un peu plus\n" +
                        "bas. Vous posez le Globe qui continue à chanter doucement, et vous dégainez E.J.\n" +
                        "Rendez-vous au 172.\n");

        chapter163.addChoice(new Choice("Page 172", "172"));

        Chapter chapter164 = new Chapter("164", "",
                "164\n" +
                        "Le couvercle du coffre s'ouvre brusquement. Mais au même instant, le rubis flamboie\n" +
                        "brièvement dans une explosion de lumière rouge sang, puis s'effrite et tombe en\n" +
                        "poussière. L'explosion vous coûte 30 POINTS DE VIE.\n" +
                        "Si vous avez perdu la vie, rendez-vous au 14. Sinon, rendez-vous au 169, pour\n" +
                        "examiner le contenu du coffre.\n");

        chapter164.addChoice(new Choice("Page 14", "14"));
        chapter164.addChoice(new Choice("Page 169", "169"));

        Chapter chapter165 = new Chapter("165", "",
                "165\n" +
                        "Oh, oh. Des petites Formes noires s'envolent du coffre. De toutes petites créatures de\n" +
                        "la taille d'une main d'homme, peut-être même plus petites. Six en tout, qui volètent\n" +
                        "comme des chauves-souris ou des papillons. Mais il ne s'agit ni de chauves-souris ni\n" +
                        "de papillons. Ni d'oiseaux, d'insectes volants ou de quoi que ce soit du même genre.\n" +
                        "Impossible d'en décrire l'apparence ! Elles ressemblent, eh bien tout simplement à des\n" +
                        "ombres. Peut-être sont-elles dépourvues de réalité ? Elles sont sans doute inoffensives,\n" +
                        "et ne valent pas que l'on s'en inquiète. N'empêche qu'elles volètent dans votre direction\n" +
                        "!\n" +
                        "Si vous décidez d'attaquer les Formes, rendez-vous au 157.\n" +
                        "Si vous préférez attendre pour voir si les Formes sont bien disposées à votre égard,\n" +
                        "rendez-vous au 168.\n");

        chapter165.addChoice(new Choice("Page 157", "157"));
        chapter165.addChoice(new Choice("Page 168", "168"));

        Chapter chapter166 = new Chapter("166", "",
                "166\n" +
                        "Sans perdre un instant, vous sortez le Globe de votre sac, et vous soufflez dessus. Il\n" +
                        "semble d'abord se troubler, puis il se met à flamboyer d'une éblouissante lumière\n" +
                        "mauve. Un vaste bruissement d'ailes retentit alors au-dessus de vous : de toute\n" +
                        "évidence, le phénomène a dérangé les monstres. Vous respirez profondément et, le\n" +
                        "cœur battant, vous vous avancez à pas comptés dans la caverne. Le Globe va-t-il vous\n" +
                        "protéger? Si la magie échoue, votre force, votre expérience et les sortilèges qui vous\n" +
                        "restent ne vous aideront que momentanément contre les énormes créatures qui vont\n" +
                        "fondre sur vous.\n" +
                        "Les Dragons, nerveux, s'agitent, vous fixant d'un regard intense. Mais vous atteignez\n" +
                        "l'extrémité de la première marche sans qu'ils aient autrement réagi, et vous avancez sur\n" +
                        "la marche suivante. Le Dragon de Bronze demeure impassible, comme vous en avait\n" +
                        "averti l'inscription figurant sur la plaque de cuivre. Du moins n'esquisse-t-il aucun\n" +
                        "mouvement dans votre direction, attendant sans aucun doute que vous soyez arrivé à\n" +
                        "sa hauteur. Vous hésitez quelque peu, et vous levez la tête. Les yeux des Dragons\n" +
                        "luisent férocement, reflétant la lumière mauve du Globe. Soudain l'un d'eux prend son\n" +
                        "élan d'une corniche, et se laisse tomber dans votre direction. Mais rapidement, il\n" +
                        "déploie ses ailes et, amorçant un virage, regagne son perchoir. Vous êtes maintenant\n" +
                        "au bout du deuxième degré, et vous descendez sur le suivant, quand soudain, la\n" +
                        "lumière du Globe se ternit, vacille et s'éteint ! Pendant un long moment, un silence\n" +
                        "absolu règne dans la caverne. Puis l'enfer semble se déchaîner au-des- sus de vous\n" +
                        "lorsque les puissants Dragons prennent leur envol. Les battements de leurs grandes\n" +
                        "ailes déclenchent une véritable tornade, et la caverne tout entière est illuminée par les\n" +
                        "jets de feu qui sortent de leur gueule.\n" +
                        "Vous lâchez le Globe qui se brise sur le sol, et vous dégainez votre épée. Mais le\n" +
                        "combat qui vous attend est par trop inégal. Le premier monstre vous saisit dans ses\n" +
                        "énormes griffes, et bientôt vous êtes environné d'un tourbillon d'ailes et de jets de\n" +
                        "flammes. Avant de perdre connaissance, vous entendez une voix sonore qui résonne en\n" +
                        "vous : Tu dois essayer de nouveau, Pip ! Essaye encore ! Encore ! Encore !\n" +
                        "Lorsque vous reprenez conscience, vous êtes étendu sur le sol glacé d'une grotte. Les\n" +
                        "Dragons ont disparu, mais vous avez perdu la moitié de vos POINTS DE VIE.\n" +
                        "Rendez-vous au 108.\n");

        chapter166.addChoice(new Choice("Page 108", "108"));

        Chapter chapter167 = new Chapter("167", "",
                "167\n" +
                        "Vous venez de perdre votre arme. Elle est restée prisonnière des toiles d'araignées.\n" +
                        "Retournez au 169 et faites une nouvelle tentative\n");

        chapter167.addChoice(new Choice("Page 169", "169"));

        Chapter chapter168 = new Chapter("168", "",
                "168\n" +
                        "Les Formes volètent doucement dans votre direction, l'une d'elle précédant les autres.\n" +
                        "Elles s'approchent de plus en plus, ces petites ombres silencieuses ! La Forme qui\n" +
                        "vient en tête est presque sur vous. Elle effleure votre bras, légère, impalpable, puis,\n" +
                        "sans vous causer la moindre douleur, elle pénètre en vous. Vous venez de perdre 15\n" +
                        "POINTS DE VIE, maladroit ! Et si vous venez de perdre aussi la vie, rendez-vous au\n" +
                        "14.\n" +
                        "Les cinq autres Formes se dirigent vers vous les unes derrière les autres. Impossible\n" +
                        "d'échapper au combat. Mais une bonne nouvelle est qu'il vous suffît de leur infliger 4\n" +
                        "Points de Dommage pour les tuer. La mauvaise nouvelle, c'est que si vous ne vous en\n" +
                        "débarrassez pas du premier coup, la Forme va pénétrer dans votre corps et s'y fondre\n" +
                        "lentement, vous faisant perdre 15 POINTS DE VIE. Bien entendu, elle se détruit alors\n" +
                        "d'elle-même, mais c'est une piètre consolation, n'est-ce pas ? Les Formes attaquent à\n" +
                        "tour de rôle, et n'oubliez pas qu'elles sont au nombre de six. Bonne chance !\n" +
                        "Si vous sortez vainqueur de ce combat, rendez-vous au 162. Sinon, rendez-vous au 14.\n");

        chapter168.addChoice(new Choice("Page 14", "14"));
        chapter168.addChoice(new Choice("Page 162", "162"));

        Chapter chapter169 = new Chapter("169", "",
                "169\n" +
                        "Ce coffre n'a pas dû être ouvert depuis de longues années, car un amoncellement de\n" +
                        "toiles d'araignées poussiéreuses recouvre son contenu. Comment allez-vous vous\n" +
                        "débarrasser de ces encombrantes toiles d'araignées ?\n" +
                        "Allez-vous les balayer d'un revers de la main? Rendez-vous au 161.\n" +
                        "Allez-vous les écarter à l'aide d'E.J. ? Rendez-vous au 158.\n" +
                        "Préférez-vous prendre le risque d'utiliser une autre de vos armes pour en venir à bout ?\n" +
                        "Rendez-vous au l67. Allez-vous essayer de les brûler à l'aide d'une Boule de Feu, ou\n" +
                        "de tout autre sortilège susceptible de se montrer efficace dans ce cas ? Rendez-vous au\n" +
                        "159. \n");

        chapter169.addChoice(new Choice("Page 161", "161"));
        chapter169.addChoice(new Choice("Page 158", "158"));
        chapter169.addChoice(new Choice("Page 167", "167"));
        chapter169.addChoice(new Choice("Page 159", "159"));

        Chapter chapter170 = new Chapter("170", "",
                "170\n" +
                        "Un message, rédigé récemment selon toute apparence, déclare :\n" +
                        "Moi, Ethelbert, Moine Guerrier, loyal sujet d'Arturus Rex, fils de Uthur Pendragon, et\n" +
                        "Suzerain légitime du Royaume d'Avalon, atteste par ces lignes que, par la grâce de\n" +
                        "Dieu, et de mes pieds agiles, j'ai évité l'immonde créature rampante qui garde cette\n" +
                        "salle maudite et que j'ai, a mon grand dam, exploré le coffre qui s'y trouvait. Sache, toi\n" +
                        "qui va peut-être suivre mes pas, que si le coffre contient un objet d'une valeur\n" +
                        "inestimable, il recèle également la mort. La mort sous de multiples formes. Voici ce\n" +
                        "que j'ai découvert :\n" +
                        "A l'intérieur du moraillon se dissimule une aiguille dont la pointe a été trempée dans le\n" +
                        "poison le plus violent.\n" +
                        "Dans le couvercle est incrustée une pierre précieuse qui, sous l'effet d'une pression\n" +
                        "déclenchera l'ouverture du coffre et vaudra à l'aventurier qui l'a touchée une\n" +
                        "malédiction entraînant pour lui la perte immédiate de 30 POINTS DE VIE.\n" +
                        "A l'intérieur du coffre se trouvent des entrelacs de fils semblables à des toiles\n" +
                        "d'araignées ; et pourtant ce ne sont pas des toiles d'araignées ordinaires, car ces fils\n" +
                        "immondes capturent et immobilisent toute créature qui les touche. Seule une lame\n" +
                        "magique peut les trancher en toute impunité ; à moins qu'ils ne soient brûlés par le feu\n" +
                        "magique.\n" +
                        "Sous les toiles d'araignées rodent les créatures de la nuit, des ombres grandes comme\n" +
                        "la main d'un homme. Elles sont au nombre de six. Mais, chacune d'entre elles est si\n" +
                        "faible, qu'un seul coup peut l'anéantir, et pourtant si forte qu'elle peut supprimer 15\n" +
                        "POINTS DE VIE en un instant.\n" +
                        "Sous ces créatures repose le trésor du coffre, un globe magique qui seul, affirme-t-on,\n" +
                        "peut assurer la survie d'un aventurier dans cette terrible caverne. Mais quant à moi je\n" +
                        "n'en crois rien, préférant me fier à la grâce de Dieu. J'ai donc laissé le globe dans le\n" +
                        "coffre pour ceux qui viendraient après moi. Certifié véridique, et signé.\n" +
                        "ETHELBERT, Moine Guerrier.\n" +
                        "Maintenant rendez-vous au 156 pour examiner le coffre.\n");

        chapter170.addChoice(new Choice("Page 156", "156"));

        Chapter chapter171 = new Chapter("171", "",
                "171\n" +
                        "Une aiguille jaillit du moraillon et vous perce le pouce. Vous ressentez aussitôt une\n" +
                        "douleur cuisante qui se transforme très vite en une brûlure intolérable, tandis que\n" +
                        "votre bras tout entier se met à enfiler. Bien inquiétant, non ? Cette aiguille, de toute\n" +
                        "évidence, était empoisonnée, Pip. Si vous n'êtes pas protégé contre le poison, lancez\n" +
                        "deux dés.\n" +
                        "Si vous faites de 2 à 4, vous êtes naturellement immunisé. Retournez au 156, et\n" +
                        "essayez une autre méthode (plus sûre, espérons-le) pour ouvrir le coffre.\n" +
                        "Si vous faites de 5 à 12, le poison vous terrasse. Rendez-vous au 14.\n");

        chapter171.addChoice(new Choice("Page 156", "156"));
        chapter171.addChoice(new Choice("Page 14", "14"));

        Chapter chapter172 = new Chapter("172", "",
                "172\n" +
                        "Au moment où vous atteignez le dernier degré, le Dragon de Bronze se dresse\n" +
                        "brusquement. Malgré son corps massif, cette créature se meut avec une agilité\n" +
                        "terrifiante. Il vous domine de toute sa taille, ses yeux d'ambre étincelant de haine... et\n" +
                        "d'intelligence. Dragon peut-être, mais pas de l'espèce ordinaire des lézards cracheurs\n" +
                        "de feu. C'est là un être pétri de force, de puissance, de ruse. Maintenant que vous vous\n" +
                        "trouvez enfin face à face avec lui, vous comprenez que la légende l'ait fait naître en\n" +
                        "Enfer. Une aura de puissance magique l'entoure, une aura maléfique. Toute votre\n" +
                        "force, votre habileté, votre ingéniosité, tous les sortilèges qui vous restent doivent être\n" +
                        "jetés dans le combat qui se prépare si vous voulez avoir la moindre chance de vaincre.\n" +
                        "Le Dragon de Bronze dispose de 150 POINTS DE VIE, beaucoup plus que vous-\n" +
                        "même. Il frappe s'il obtient au minimum 5 et vous infligera 5 Points de Dommage\n" +
                        "supplémentaires à chaque fois qu'il réussira à vous atteindre d'un croc ou d'une griffe.\n" +
                        "Tous les trois coups, il crache un jet de feu bleu et or qui, s'il vous touche, vous inflige\n" +
                        "10 Points de Dommage. Vous pouvez utiliser tous vos sortilèges contre lui.\n" +
                        "L'INVISIBILITE n'a qu'une efficacité limitée dans la mesure où le Dragon peut quand\n" +
                        "même sentir votre présence, mais il lui faut alors obtenir au minimum 8 pour vous\n" +
                        "frapper pendant que vous demeurez invisible. Allez-y, Pip, et ne vous perdez pas dans\n" +
                        "vos comptes !\n" +
                        "Si le Dragon de Bronze vous tue, rendez-vous au 14. Si vous tuez le Dragon de\n" +
                        "Bronze, rendez-vous au 173.\n");

        chapter172.addChoice(new Choice("Page 14", "14"));
        chapter172.addChoice(new Choice("Page 173", "173"));

        Chapter chapter173 = new Chapter("173", "",
                "173\n" +
                        "La gigantesque carcasse du redoutable Dragon de Bronze gît à vos pieds, encore\n" +
                        "palpitante. Vous vous dirigez vivement vers l'étincelante boule de cristal rouge et, d'un\n" +
                        "revers de main, vous la faites tomber du piédestal. Elle se brise en mille morceaux sur\n" +
                        "le sol rocheux.\n" +
                        "Un silencieux éclair lumineux ! Devant vous, en robe souillée et déchirée, son épée à\n" +
                        "double tranchant glissée à la ceinture, se dresse un moine corpulent et barbu, aux yeux\n" +
                        "bruns luisants, aux sourcils broussailleux, aux cheveux hirsutes d'un noir de jais. —\n" +
                        "Par l'orteil sacré de saint Paul, j'étais vraiment à l'étroit là-dedans ! grommelle-t-il.\n" +
                        "Puis, s'inclinant légèrement, il se présente : Ethelbert, Moine Guerrier et fidèle\n" +
                        "serviteur d'Arturus Rex, fils de Uthur Pendragon et légitime Suzerain du Royaume\n" +
                        "d'Avalon, à votre service.\n" +
                        "Il hésite, jette un coup d'oeil au Dragon de Bronze. —En somme, si je comprends bien,\n" +
                        "tu n'as guère besoin de mes services aujourd'hui, Pip l'Aventurier, alors que j'ai mille\n" +
                        "raisons de t'être reconnaissant de celui que tu m'as rendu. Mais du moins... Il hausse\n" +
                        "les épaules et rajuste plus confortablement son épée à sa hanche. Je peux t'indiquer le\n" +
                        "moyen de sortir d'ici afin que nous regagnions Camelot ensemble pour annoncer que le\n" +
                        "Dragon de Bronze a cessé de menacer le royaume.\n\n");

        chapter173.addChoice(new Choice("Triomphe !", "174"));

        Chapter chapter174 = new Chapter("174", "Le Triomphe de Pip",
                "Le Triomphe\n" +
                        "Vint donc un jour en Avalon où deux étranges personnages dépenaillés réussirent\n" +
                        "péniblement à sortir de l'Antre du Dragon pour s'engager le long des chemins secrets\n" +
                        "qui finiraient par les ramener à Camelot. L'un d'eux était un gigantesque Moine\n" +
                        "Guerrier aux yeux sombres, à la barbe noire. L'autre, plus petit, plus mince, n'en avait\n" +
                        "pas moins fière allure : c'était un aventurier, jeune mais plein d'expérience dont le\n" +
                        "nom était sûrement destiné à vivre à jamais dans les annales du Royaume.\n" +
                        "Ces deux êtres bizarrement assortis cheminaient avec lenteur, encore épuisés tous les\n" +
                        "deux par les efforts qu'ils avaient dû fournir au cours de leurs diverses aventures,\n" +
                        "étranges et périlleuses. Et aussi parce qu'ils traînaient derrière eux une litière sur\n" +
                        "laquelle était empilé un butin important, glané dans l'Antre des Dragons. Non\n" +
                        "qu'Ethelbert, le moine, s'intéressât beaucoup à ce genre de trésor, bien sûr. Mais Pip, le\n" +
                        "jeune aventurier professait une philosophie différente et était encore ulcéré d'avoir déjà\n" +
                        "perdu un trésor conquis lors d'une autre aventure.\n" +
                        "Le trajet de retour fut sans histoire, car les chemins leur étaient maintenant familiers,\n" +
                        "ce qui leur permit d'éviter des endroits aussi épouvantables que le village de la Pierre-\n" +
                        "qui-Mue. Il leur fallut néanmoins plusieurs jours pour revenir sur leurs pas et regagner\n" +
                        "leur point de départ, ou du moins le point d'où Pip était parti. Et là, dans le champ, que\n" +
                        "virent-ils ? Wanda la Vagabonde, la vache favorite de Pip, la mine prospère bien\n" +
                        "nourrie d'herbe grasse, le pelage lisse et lustré, comme si rien de fâcheux ne s'était\n" +
                        "produit dans l'intervalle.\n" +
                        "• Et maintenant, mon jeune ami ? demanda Ethel- bert qui semblait avoir attaché ses\n" +
                        "pas à ceux de Pip depuis que celui-ci l'avait sauvé de la sphère magique de cristal.\n" +
                        "• Je ne sais pas trop, répondit Pip en fronçant légèrement les sourcils. Je suppose que\n" +
                        "je devrais rendre compte à Merlin de mon aventure, et le prévenir que le Dragon de\n" +
                        "Bronze est mort, afin qu'il puisse aller trouver le Roi et réclamer sa pension. Mais, à\n" +
                        "dire vrai, je ne sais pas où le chercher. Il possède une sorte de château en bois dans la\n" +
                        "forêt, mais la dernière fois que je l'ai vu, il se trouvait dans sa Grotte de Cristal et\n" +
                        "personne ne peut le joindre à cet endroit-là.\n" +
                        "• Mais tu dois bien le savoir, protesta Ethelbert, puisque c'est là que tu l'as rencontré.\n" +
                        "Tu ne te rappelles pas le chemin ?\n" +
                        "Je n'ai suivi aucun chemin, expliqua Pip tout en veillant à ne pas se montrer trop\n" +
                        "explicite. Il m'a amené dans cet endroit par magie. — Alors, peut-être va-t-il nous y\n" +
                        "ramener par magie, suggéra Ethelbert. Puisque tu es parti d'ici, pourquoi ne pas nous\n" +
                        "asseoir et attendre qu'il se manifeste ? Après tout, il est censé être un grand magicien,\n" +
                        "le plus grand du Royaume ! Il va sûrement se rendre compte très vite que nous\n" +
                        "sommes ici avec de bonnes nouvelles à lui apprendre. Les deux compagnons\n" +
                        "s'assirent donc dans le champ, surveillant leur trésor, sans rien de mieux à faire que de\n" +
                        "contempler Wanda la Vagabonde, et ils attendirent. Ils attendirent et attendirent et\n" +
                        "attendirent...\n" +
                        "Pendant ce temps, dans la Grotte de Cristal (où l'atmosphère était en réalité presque\n" +
                        "aussi nauséabonde que celle de l'Antre du Dragon), le plus grand magicien du\n" +
                        "Royaume se heurtait à quelques problèmes avec son dernier sortilège. C'était un tour\n" +
                        "de magie relativement simple, ou qui aurait dû l'être, basé sur le principe alchimique,\n" +
                        "tant de fois mis à l'épreuve, qui permet de changer le plomb en or. Sa pension ayant\n" +
                        "été supprimée, il devenait impératif pour le magicien d'amasser une petite provision de\n" +
                        "métal précieux. Aussi, poussé par le désespoir avait-il acheté à un marchand un stock\n" +
                        "de plomb, et loué un attelage de chevaux de trait pour l'amener jusqu'à l'entrée de son\n" +
                        "actuel domicile secret. La transaction, y compris la location des chevaux, lui avait\n" +
                        "coûté à peu près jusqu'à son dernier sou, mais il était persuadé qu'il pourrait rentrer\n" +
                        "dans ses frais (et même récolter un gros bénéfice) une fois terminée son opération\n" +
                        "d'alchimie. Durant une semaine, il avait lui-même transporté le plomb, par petites\n" +
                        "quantités, jusque dans la grotte, et l'avait entreposé à proximité du fourneau de fortune\n" +
                        "qui jouait un rôle si important dans l'opération d'alchimie.\n" +
                        "Pour ceux que ces problèmes intéressent, précisons qu'il utilisait un procédé appelé le\n" +
                        "Mariage Chimique de la Reine Blanche et du Dragon Vert, sans aucun rapport avec le\n" +
                        "mariage, les dragons ou les reines, ni même, entre nous, avec la chimie (ce qui montre\n" +
                        "à quel point l'alchimie peut être déroutante). Il consiste en fait à fondre le plomb sur le\n" +
                        "fourneau, puis à ajouter à la matière en fusion une série d'herbes rares et d'épices, tout\n" +
                        "en agitant une baguette magique et en psalmodiant les mots d'un sortilège particulier.\n" +
                        "Merlin s'était livré maintes fois à cette opération lorsqu'il était étudiant et qu'il\n" +
                        "apprenait les rudiments de la magie au Collège des Druides de Llandogo. A l'époque,\n" +
                        "sous la direction de ses précepteurs, tout avait toujours fonctionné parfaitement.\n" +
                        "Maintenant, pour une raison quelconque, l'opération se soldait par des échecs répétés.\n" +
                        "Le plomb se transformait bien, mais pas en or. Chaque fois que l'écho du sortilège\n" +
                        "s'éteignait sous les voûtes de la grotte, le plomb se transformait en pudding flambé.\n" +
                        "A la septième métamorphose consécutive de ce genre, Merlin, déjà peu amateur de\n" +
                        "pudding flambé, entra, contrairement à son habitude, dans une telle rage qu'il renversa\n" +
                        "avec violence le fourneau et se dirigea à grands pas vers une autre partie de sa Grotte\n" +
                        "de Cristal. Sous le coup de l'exaspération il envisagea un instant de jeter un mauvais\n" +
                        "sort sur le potager de l'archevêque de Canterbury. L'antipathie mutuelle entre Merlin et\n" +
                        "l'Archevêque était de notoriété publique en Avalon, bien que personne — pas même\n" +
                        "les deux nobles vieillards — ne put se rappeler l'origine de cette inimitié.\n" +
                        "Bien que nul ne puisse, bien entendu, souhaiter du mal à un archevêque, on peut se\n" +
                        "réjouir que Merlin, ce jour-là, se soit mis en colère. Car pendant qu'il cherchait dans\n" +
                        "un placard sa baguette à mauvais sorts, il tomba par hasard sur sa boule de cristal\n" +
                        "(égarée depuis près d'une semaine) et aperçut à l'intérieur le jeune Pip en. compagnie\n" +
                        "d'une vache et d'un personnage aux traits rudes en robe de moine. A côté d'eux se\n" +
                        "trouvait une litière de fortune, sur laquelle apparemment étaient amassés pêle-mêle\n" +
                        "toutes sortes de trésors. Mais, ce qui était le plus remarquable c'était la toile recouvrant\n" +
                        "ce bric-à-brac qui avait glissé légèrement, laissant apparaître la tête du Dragon de\n" +
                        "Bronze. Merlin, le nez sur la boule de cristal, en scruta l'intérieur pendant un long\n" +
                        "moment, n'en croyant pas ses yeux. Puis il se livra à un manège des plus étranges, et\n" +
                        "peut-être bien magique. Poussant des cris de joie, il se mit à faire des claquettes tout\n" +
                        "autour de sa Grotte de Cristal.\n");

        chapter174.addChoice(new Choice("Page 174", "174"));



        // Add chapters to scenario
        scenario.addChapter(chapter0);
        scenario.addChapter(chapter1);
        scenario.addChapter(chapter2);
        scenario.addChapter(chapter3);
        scenario.addChapter(chapter4);
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
        scenario.addChapter(chapter174);


        // Set the starting chapter
        scenario.setStartChapterId("0");

        return scenario;
    }
} 