everyNth :: Int -> [a] -> [a]
everyNth n xs =
    [x | (x,i) <- zip xs [1..], i `mod` n == 0]

skips :: [a] -> [[a]]
skips xs =
    [everyNth n xs | n <- [1..length xs]]

main :: IO ()
main = do
    print (skips "ABCD")
    print (skips "hello!")
    print (skips ([] :: String))