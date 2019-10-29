# "Diabólico III"


# Parte 1: Escondites
Las almas están cansadas de ser casadas por los demonios y desarrollan una habilidad que les permite, momentos antes de ser cazadas por un demonio, esconderse dentro del lugar al que pertenece y de esa forma evitar se cazadas.

Existen lugares más seguros donde las almas pueden esconderse al intentar ser cazadas y lugares más inseguros.
Cuando un demonio intenta cazar en un lugar seguro, las almas corren a esconderse. Dependiendo las condiciones del lugar cada una logra o no. Si el alma logró esconderse el demonio no logra cazarla. Si puede atormentarla.

Existen distintos lugares, algunos mas seguros que otros, pero en todos hay escondites en donde las almas pueden esconderse, eso si, todos los lugares tienen un límite de almas para esconder. Si llegó al límite, no se aceptan mas almas.
Por otro lado, por esconderse un alma debe pagar un costo, ese costo depende del lugar.

Por último, Cuándo salen las almas del escondite?, salen ni bien un demonio termina de cazar en ese lugar.

### Lugares

#### Paraíso
- Tiene 10 lugares para esconderse
- Lugar muy seguro para las almas, si hay lugar y el alma tiene `bondad` > 0, puede esconderse
- Solo se la penaliza descontando 1 en su `bondad`

#### Purgatorio
- Tiene 5 lugares para esconderse
- Si hay lugar , el alma tiene `bondad` > 10 y un `valor` > 5, puede esconderse
- Se la penaliza descontando 5 en su `bondad` y 1 en 

#### Infierno
- Tiene 2 lugares para esconderse
- Si hay lugar, el alma NO es friolenta y  su `bondad` es igual a su `valor`, puede esconderse
- Se la penaliza conviertiendola en `friolanta`

# Parte 2
Por otro lado, los demonios adquieren armas y si están en el mismo lugar, antes de cazar, luchan con otros demonios y dependiendo qué tipo de demonio son y qué arma usan ganan o pierden el combate. 

