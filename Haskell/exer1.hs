toDigits :: Integer -> [Integer]
toDigits n
    | n <= 0    = []
    | otherwise = toDigits (n `div` 10) ++ [n `mod` 10]

doubleEveryOther :: [Integer] -> [Integer]
doubleEveryOther xs = reverse (helper (reverse xs))
  where
    helper [] = []
    helper [x] = [x]
    helper (x:y:rest) = x : (2 * y) : helper rest

sumDigits :: [Integer] -> Integer
sumDigits [] = 0
sumDigits (x:xs)
    | x < 10    = x + sumDigits xs
    | otherwise = sumDigits (toDigits x) + sumDigits xs

validate :: Integer -> Bool
validate n =
    sumDigits (doubleEveryOther (toDigits n)) `mod` 10 == 0

main :: IO ()
main = do
    putStrLn "Digite o número do cartão:"
    entrada <- getLine
    let numero = read entrada :: Integer

    if validate numero
        then putStrLn "Cartão válido!"
        else putStrLn "Cartão inválido!"
