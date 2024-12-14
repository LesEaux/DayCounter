# Day Counter Mod for Minecraft

## Description
Le **Day Counter Mod** est un mod simple pour Minecraft qui affiche le nombre de jours de survie dans une partie. Il permet aux joueurs de suivre combien de jours se sont écoulés dans le monde, utile pour les joueurs qui aiment suivre leur progression ou simplement pour ceux qui aiment les défis.

### Fonctionnalités :
- Affiche le nombre de jours passés depuis le début de la survie.
- Affichage au dessus de la 'hotbar'.

## Installation

### Prérequis :
1. **Minecraft version 1.21.1**
2. **Fabric Mod Loader** pour Minecraft 1.21.1
3. **Fabric API**

### Étapes d'installation :
1. Téléchargez [Fabric Mod Loader](https://fabricmc.net/use/) si ce n’est pas déjà fait.
2. Téléchargez le fichier JAR du mod (généré depuis ce projet).
3. Ouvrez le dossier `mods` dans votre répertoire Minecraft :
   - Sous Windows :
     ```
     %appdata%\.minecraft\mods
     ```
   - Sous Linux/Mac :
     ```
     ~/.minecraft/mods
     ```
4. Déplacez le fichier `.jar` du mod dans le dossier `mods`.
5. Lancez Minecraft avec **Fabric Loader**.

## Utilisation
Une fois le mod installé et Minecraft lancé, le nombre de jours de survie s'affichera dans le coin supérieur gauche de l'écran pendant que vous jouez.

Le nombre de jours est mis à jour à chaque jour en jeu, et il est calculé en fonction des cycles de jour/nuit dans Minecraft.

## Développement

Si vous souhaitez contribuer à ce projet ou y apporter des modifications, voici les étapes pour construire le mod :

1. Clonez ce dépôt ou téléchargez-le.
2. Ouvrez le projet dans un IDE comme **IntelliJ IDEA**.
3. Synchronisez le projet avec Gradle (via `Gradle` > `Refresh`).
4. Exécutez la tâche `build` dans Gradle pour générer un fichier `.jar` :
   - `Gradle` > `Tasks` > `build` > `build`
5. Le fichier `.jar` sera généré dans le dossier `build/libs/`.

## Contributions

Les contributions sont les bienvenues ! Si vous souhaitez contribuer, n’hésitez pas à ouvrir un problème ou à soumettre une *pull request*.

## License
Ce mod est sous licence [MIT](https://opensource.org/licenses/MIT).
