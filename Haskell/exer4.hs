xor :: [Bool] -> Bool
xor [] = False
xor (x:xs)
    | x         = not (xor xs)
    | otherwise = xor xs

main :: IO ()
main = do
    print (xor [])
    print (xor [True])
    print (xor [True, False])
    print (xor [True, True])
    print (xor [True, False, True])
    print (xor [True, True, True])
