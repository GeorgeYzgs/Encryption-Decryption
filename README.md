# Encryption-Decryption

The program should be run with command line arguments (5 weeks / 100h Java Experience)

Valid arguments : 

<b>-alg</b> followed by either shift (Caesar Cypher) or unicode (unicode cypher) 

<b>-mode</b> followed by either enc or dec (for encryption or decryption respectively)

<b>-key</b> followed by an integer as the algorithm's key

<b>-data</b> followed by a string to pass as text or cyphertext

<b>-in</b> followed by a file path if you wish to read from a file instead

<b>-out</b> followed by a file path if you wish to export the reult to a file instead of the console


example:

java EncryptDecrypt -alg shift -mode dec -key 5 -data "Ofaf nx fbjxtrj!"

will output to the console:

Java is awesome!

