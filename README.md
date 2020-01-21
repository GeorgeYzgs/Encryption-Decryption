# Encryption-Decryption

The program should be run with command line arguments (5 weeks / 100h Java Experience)

Valid arguments : 
-alg followed by either shift (Caesar Cypher) or unicode (unicode cypher) 
-mode followed by either enc or dec (for encryption or decryption respectively)
-key followed by an integer as the algorithm's key
-data followed by a string to pass as text or cyphertext
-in followed by a file path if you wish to read from a file instead
-out followed by a file path if you wish to export the reult to a file instead of the console

example:
java EncryptDecrypt -alg shift -mode dec -key 5 -data "Ofaf nx fbjxtrj!"
will output to the console:
Java is awesome!

