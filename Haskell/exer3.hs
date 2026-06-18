localMaxima :: Ord a => [a] -> [a]
localMaxima (x:y:z:xs)
    | y > x && y > z = y : localMaxima (y:z:xs)
    | otherwise      = localMaxima (y:z:xs)

localMaxima _ = []

main :: IO ()
main = do
    print (localMaxima [2,9,5,6,1])
    print (localMaxima [2,3,4,1,5])
    print (localMaxima [1,2,3,4,5])
