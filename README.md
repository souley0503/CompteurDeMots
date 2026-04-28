# Compteur de Mots en Direct (Java)

## Description
Le projet permet de compter en temps réel le nombre de mots saisis par un utilisateur. Le programme lit les entrées ligne par ligne et calcule le total cumulé jusqu'à ce que l'utilisateur décide d'arrêter la saisie.

## Fonctionnalités
- **Saisie interactive** : L'utilisateur peut saisir plusieurs paragraphes de texte.
- **Détection intelligente des mots** : Utilise des expressions régulières (`\\s+`) pour traiter correctement les espaces multiples, les tabulations et les sauts de ligne.
- **Condition d'arrêt personnalisée** : Le programme se termine proprement lorsque l'utilisateur tape le mot-clé `FIN`.
- **Calcul cumulatif** : Affiche le score total uniquement à la fin de la session de saisie.

## Logique de Programmation
Le programme repose sur plusieurs piliers techniques du langage Java :
1. **Scanner(System.in)** : Pour capturer le flux d'entrée du clavier.
2. **Boucle While** : Pour permettre une saisie continue sur plusieurs lignes.
3. **Méthode .split()** : Pour transformer chaque ligne en un tableau de chaînes de caractères (mots).
4. **Gestion de la mémoire** : Fermeture systématique du flux `Scanner` en fin d'exécution.

