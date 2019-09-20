# scaled-two
Klassen TestLongCounter er en simpel klasse som opretter to tråde, som hver især tæller en counter op med 10.000.000. Det forventede resultat af denne optælling er derfor 20.000.000. 
1. Hvilket resultat får du?

//19888984

2. Hvad kaldes dette problem, og hvorfor sker det?

//Lost update problem (race condition)
3. Undersøg Javas 'synchronized'-keyword. Dette bruges til at låse en metode, så der kun kan køre en tråd på den ad gang. Brug 'synchronized' til at få det korrekte resultat hver gang

//linje 26

Udvid LongCounter klassen med en 'decrement'-metode, som trækker én fra counteren. Lad tråd 1 køre 'increment' og tråd 2 køre 'decrement'. 
1. Hvad er det forventede resultat?

//0, men det får vi ikke grundet samme problemstilling som ovenstående

2. Hvis du kun låser/synchronizer 'increment'-metoden, hvad forventer du så resultatet bliver? Hvorfor?

//hvis man låser increment fås et negativt tal, fordi increment altid venter på decrement, men decrement behøver ikke vente på increment

Skift branch til 'multithread', og ændr antallet af tråde til 10. Koden er lavet således at, hver tråd står for sit eget interval. Eksempelvis når der skal tælles op til 100.000.000 på 10 tråde, så kører første tråd i intervallet 0 - 10.000.000, 2. tråd på 10.000.000 - 20.000.000 osv.
1. Før du kører klassen, hvad forventer du så, der sker med hastigheden på programmet, når flere tråde kører samtidig?
2. Tag tid på koden, når du kører hhv. én tråd og 10 tråde. Hvad er tidsforskellen? (På mac kan du kalde koden med en timer fra terminalen: kør 'javac TestLongCounter.java' og herefter 'time java TestLongCounter' - Ellers så brug et stopur.)

//en tråd: ca 4 s.
//10 tråde: ca 7 s. (varierer fra computer til computer)

3. Hvorfor får du dette resultat?

//Når man incrementer en counter er det en meget simpel operation. I vores tilfælde betyder det, at det faktisk bliver mere krævende at instantiere 10 tråde, fremfor at lade en tråd eksekvere koden.

## useful links
caching in three layer architecture: https://docs.oracle.com/cd/A97335_02/caching.102/a88706/ic_intro.htm
memory hierarchy: https://www.elprocus.com/memory-hierarchy-in-computer-architecture/
RAM: https://searchstorage.techtarget.com/definition/RAM-random-access-memory
Lost update problem: https://www.morpheusdata.com/blog/2015-02-21-lost-update-db
