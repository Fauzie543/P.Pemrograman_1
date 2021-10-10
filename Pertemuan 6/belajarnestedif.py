umur = input("masukan umur anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda balita")
    umur_orangtua =input("Masukan umur orang tua anda = ")
    if (int(umur_orangtua)<15):
        print("Orang tua anda perlu pengasuh")
    else:
        print("Anda dapat mengasuh anak sendiri ")
elif (umur > 5 and umur <= 19):
    print("Anda remaja")
else:
    print("Umur anda tidak valid")