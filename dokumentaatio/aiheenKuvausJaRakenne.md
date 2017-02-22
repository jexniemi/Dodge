**Aihe:** Dodge -peli, jossa ohjataan jonkinlaista alusta/olentoa, joka pystyy liikkumaan vaakasuorassa ja sillä väistellään jonkinlaisia ylhäältä vastaan tulevia vihollisia. Peli tulee olemaan aluksi yhdelle pelaajalle. 

**Pelaajan toiminnot:**

* Pelihahmon liikuttelu vaakasuorassa nuolinäppäimien avulla.

**Rakennekuvaus:**

Kaikki pelikentällä liikkuvat oliot perivät Hahmo -luokan. 
Pelaaja -luokkaa käytetään pelaajan liikutteleman hahmon luomiseen ja 
Vihollinen -luokkaa käytetään vihollisolioiden luomiseen. NappaimistonKuuntelija
kuuntelee vasenta ja oikeaa nuolinäppäintä ja muuttaa pelaajaolion 
x-koordinaatteja näiden mukaan. Kayttoliittyma luo timer -olion käyttöliittymän
luonnin yhteydessä ja tämä  pyörittää pelin tapahtumia GameTask luokan avulla
ja generoi vihollisia EnemyGeneratorTask luokkaa käyttäen.

**Luokkakaavio:**

![Alt text](luokkakaavio.png "Luokkakaavio")

**Sekvenssikaavio 1 (Pelaajan liikkuminen vasemmalle):**

![Alt text] (DodgeSekvenssikaavio1.jpg "Sekvenssikaavio 1")

**Sekvenssikaavio 2 (Pelaajan liikkuminen oikealle):**

![Alt text] (DodgeSekvenssikaavio2.jpg "Sekvenssikaavio 2")



