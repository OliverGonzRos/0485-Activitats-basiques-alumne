# ACT-BÀSICA — Activitats de Programació Bàsiques

Cada activitat és un programa Java amb un `main`. La majoria llegeixen dades del teclat
(amb `Scanner`) i escriuen el resultat per pantalla (amb `System.out.println`).
Els fitxers són a `src/main/java/`.

## Regla d'or de la sortida

La correcció automàtica compara el que imprimeix el teu programa amb el resultat esperat:

- Imprimeix exactament en el format que indica cada enunciat (mateixes etiquetes i ordre).
- Si una activitat demana diversos resultats, imprimeix-los un per línia.
- Per als decimals, escriu-los amb **punt** (`4.5`), no amb coma.

## Com treballar

1. Obre la carpeta a **VS Code** (accepta instal·lar les extensions recomanades).
2. Implementa cada programa.
3. Prova'l: ▶ *Run* a VS Code, o per consola `mvn -q compile` i `java -cp target/classes NomClasse`.
4. Fes `commit` i `push`. A cada `push`, GitHub corregeix i veuràs el resultat a **Actions**.

## Activitats (5 punts cadascuna · total 60)

| #  | Classe | Entrada (exemple) | Sortida esperada |
|----|--------|-------------------|------------------|
| 01 | `MostraDades` | (cap) | 3 línies amb les teves dades |
| 02 | `AvaluarExpressions` | (cap) | `-18` / `-4` / `10` / `-7` / `0` / `53` |
| 03 | `MagiaNumerica` | `7` | `El resultat és 2` |
| 04 | `Quadrat` | `7` | `Perímetre del quadrat = 28` / `Àrea del quadrat = 49` |
| 05 | `OperacionsMatematiques` | `4 2` | `4 + 2 = 6` / `4 - 2 = 2` / `4 * 2 = 8` / `4 / 2 = 2` |
| 06 | `Rectangle` | `7 2` | `Perímetre del rectangle = 18` / `Àrea del rectangle = 14` |
| 07 | `Temperatura` | `212` | `100.0` |
| 08 | `SumaMitjana` | `1 2 3 4` | `Suma = 10` / `Mitjana = 2.5` |
| 09 | `PreuAPagar` | `2 4.5 10` | `El valor a pagar serà: 8.1 euros` |
| 10 | `HoresMinutsSegons` | `41668` | `Hores: 11` / `Minuts: 34` / `Segons: 28` |
| 11 | `Intercanvi` | `3 7` | `a = 7` / `b = 3` |
| 12 | `MonedesMinimes` | `123` | 8 línies (vegeu enunciat) |

*(El símbol `/` separa línies de sortida diferents.)*

## Enunciats

### 01 — Mostra les teves dades (`MostraDades`)
Implementa un programa per mostrar per pantalla el teu nom i cognoms, els estudis que vas fer
el curs passat i la teva edat. Per pantalla es mostrarà una cosa semblant a:

```
El meu nom és Ana Garcia Lladonosa
L'any passat vaig estudiar Batxillerat
Tinc 19 anys
```

### 02 — AvaluarExpressions (`AvaluarExpressions`)
Crea un programa anomenat `AvaluarExpressions` que, partint de les variables
`int a=3; int b=8; int c=4; int d=2;`, executi i mostri per pantalla el resultat d'avaluar:

```
2 - a * b + c
(2 - a) * b + c
a * b - c * a - d
a / 3 - b
a / (33 - b)
d * 23 - 1 + b
```

Pensa primer quin valor donarà cada càlcul, tenint en compte la prioritat de les operacions.

### 03 — Màgia numèrica (`MagiaNumerica`)
Tria un número, multiplica'l per 3, suma-li 6, divideix el resultat entre 3 i resta-li el
número inicial. Quin és el resultat? Màgia: el resultat és **2** sempre.

### 04 — Àrea i perímetre del quadrat (`Quadrat`)
Partint del valor d'un costat (`int costat`), calcula el perímetre i l'àrea i mostra'ls:

```
Perímetre del quadrat = 28
Àrea del quadrat = 49
```

El perímetre és el costat per 4; l'àrea és el costat per ell mateix.

### 05 — Operacions matemàtiques (`OperacionsMatematiques`)
Realitza les operacions aritmètiques fonamentals (suma, resta, multiplicació i divisió)
de 2 valors enters:

```
4 + 2 = 6
4 - 2 = 2
4 * 2 = 8
4 / 2 = 2
```

### 06 — Àrea i perímetre del rectangle (`Rectangle`)
Partint dels dos costats d'un rectangle (`costatGran`, `costatPetit`), calcula el perímetre
(costat gran per 2 més costat petit per 2) i l'àrea (costat gran pel costat petit).

### 07 — Convertir temperatura (`Temperatura`)
Desa en una variable real un número que representa una temperatura en graus Fahrenheit i
converteix-la a graus Celsius: `temperatureC = ((temperatureF - 32) * 5) / 9;`

### 08 — Suma i mitjana (`SumaMitjana`)
Calcula la suma i la mitjana aritmètica de 4 valors enters introduïts per teclat.

### 09 — Preu a pagar (`PreuAPagar`)
Entrant per teclat el nombre d'unitats comprades, el preu unitari i un percentatge de
descompte, mostra el preu total a pagar.

> **Important:** escriu els decimals amb **punt** (`4.5`), no amb coma. El corrector
> automàtic llegeix els números en format anglès i la coma donaria error.

Exemple:

```
Quants productes has comprat?
2
Quant val cada producte?
4.5
Quin descompte aplicarem (%)?
10
El valor a pagar serà: 8.1 euros
```

### 10 — Hores, minuts i segons (`HoresMinutsSegons`)
Partint d'una variable amb un nombre de segons, mostra les hores, els minuts i els segons que representa.
Exemple: `41668` → `Hores: 11`, `Minuts: 34`, `Segons: 28`.

### 11 — Intercanvi (`Intercanvi`)
Intercanvia el valor de dues variables (necessitaràs una variable auxiliar) i mostra el valor
de les variables després de l'intercanvi per comprovar que s'han intercanviat correctament.

### 12 — Monedes mínimes (`MonedesMinimes`)
Demana una quantitat entera de diners (en cèntims d'euro) i mostra la quantitat mínima de
monedes necessària per lliurar-la. Les monedes poden ser d'1, 2, 5, 10, 20, 50, 100 i 200
cèntims. Per a l'entrada `123`, la sortida ha de ser:

```
0 monedes de 2 euros
1 monedes d'1 euro
0 monedes de 50 cèntims
1 monedes de 20 cèntims
0 monedes de 10 cèntims
0 monedes de 5 cèntims
1 moneda de 2 cèntims
1 moneda de 1 cèntims
```
