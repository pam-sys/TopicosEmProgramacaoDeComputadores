fibFast :: Integer -> Integer
fibFast n = fst (fibPair n)

fibPair :: Integer -> (Integer, Integer)
fibPair 0 = (0, 1)
fibPair n =
    let (a, b) = fibPair (n `div` 2)
        c = a * (2 * b - a)
        d = a * a + b * b
    in if even n
          then (c, d)
          else (d, c + d)

main :: IO ()
main = do
    print (fibFast 0)
    print (fibFast 1)
    print (fibFast 5)
    print (fibFast 10)
    print (fibFast 50)