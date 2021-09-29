print("Pendataan IPK mahasiswa semester terakhir")
print(" ")

nama = input("Masukan nama lengkap anda = ")
nama = str(nama)
ipk = input("Masukan IPK anda = ")
ipk = str(ipk)
tahun = input("Masukan masa studi anda = ")
tahun = str(tahun)

if (float(ipk) >= 3.51 and float(tahun) <= 4.0):
    print("Selamat " + nama + " dinyatakan lulus dengan Summa Cumlaude")
elif (float(ipk) >= 3.51):
    print("Selamat " + nama + " dinyatakan lulus dengan Cumlaude")
elif (float(ipk) >= 3.01 and float(ipk) < 3.51):
    print("Selamat " + nama + " dinyatakan lulus dengan sangat memuaskan")
elif (float(ipk) >= 2.76 and float(ipk) < 3.01):
    print("Selamat " + nama + " dinyatakan lulus dengan memuaskan")
elif (float(ipk) >= 2.00 and float(ipk) < 2.76):
    print("Selamat " + nama + " dinyatakan lulus dengan cukup")
elif (float(ipk) < 2.00):
    print("Maaf " + nama + " dinyatakan tidak lulus")
else:
    print("Data tidak valid")

print("          Terima Kasih")
