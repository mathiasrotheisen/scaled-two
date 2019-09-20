Den her linje har mathias tilføjet

DEN HER LINJE HAR MORTEN TILFØJET!
Også denne her!
Mathias har tilføjet denne linje

# scaled-two
Klassen TestLongCounter er en simpel klasse som opretter to tråde, som hver især tæller en counter op med 10.000.000. Det forventede resultat af denne optælling er derfor 20.000.000. 
1. Hvilket resultat får du?
2. Hvad kaldes dette problem, og hvorfor sker det?
3. Undersøg Javas 'synchronized'-keyword. Dette bruges til at låse en metode, så der kun kan køre en tråd på den ad gang. Brug 'synchronized' til at få det korrekte resultat hver gang

Udvid LongCounter klassen med en 'decrement'-metode, som trækker én fra counteren. Lad tråd 1 køre 'increment' og tråd 2 køre 'decrement'. 
1. Hvad er det forventede resultat?
2. Hvis du kun låser/synchronizer 'increment'-metoden, hvad forventer du så resultatet bliver? Hvorfor?


Skift branch til 'multithread', og ændr antallet af tråde til 10. Koden er lavet således at, hver tråd står for sit eget interval. Eksempelvis når der skal tælles op til 100.000.000 på 10 tråde, så kører første tråd i intervallet 0 - 10.000.000, 2. tråd på 10.000.000 - 20.000.000 osv.
1. Før du kører klassen, hvad forventer du så, der sker med hastigheden på programmet, når flere tråde kører samtidig?
2. Tag tid på koden, når du kører hhv. én tråd og 10 tråde. Hvad er tidsforskellen? (På mac kan du kalde koden med en timer fra terminalen: kør 'javac TestLongCounter.java' og herefter 'time java TestLongCounter' - Ellers så brug et stopur.)
3. Hvorfor får du dette resultat?

