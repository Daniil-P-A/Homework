print('1)Расчет стоимости доставки:')
rastojanie_dostavki = float(input("\nВведите  растояние поездки:"))
w = rastojanie_dostavki / 100

nadbavka_za_km = float(input("Введите сумму надбавки за км:"))
procent_za_km = w * nadbavka_za_km

rashod_na_100 = float(input("Введите расход топлива на 100км:"))
rashod_na_1 = rashod_na_100 / 100
cena_topliva = float(input("Введите цену за литр топлива:"))
cena_za_100_km = rashod_na_100 * cena_topliva

cena_za_1_km = cena_za_100_km / 100

summa_za_start = float(input("Введите сумму за старт(если таковой не имеится, впишите '0'):"))


itogovaja_summa = (procent_za_km + cena_za_1_km) * rastojanie_dostavki + summa_za_start
print("\nИтоговая сумма доставки:", itogovaja_summa)

summa_avto = float(input("\nВпишите сумму авто:"))
chislo_naloga = float(input("Введите процент налога:"))
procent_naloga = summa_avto / 100
nalog_itog = procent_naloga * chislo_naloga
print("\nСумма налога составит:", nalog_itog)

agentskiy_sbor = float(input("\nВведите сумму агентского сбора:"))
print("Сумма агентского сбора:", agentskiy_sbor)

registracionnyi_sbor = float(input("\nВведите сумму регистрационного сбора:"))
print("Сумма регистрационного сбора составляет:", registracionnyi_sbor)

itogovaja_summa_za_uslugi = itogovaja_summa + nalog_itog + agentskiy_sbor + registracionnyi_sbor
print("\n\nИтоговая сумма за услуги составит:", itogovaja_summa_za_uslugi)
summa_za_vse = itogovaja_summa_za_uslugi + summa_avto
print("Полная сумма вместе с авто:", summa_za_vse)
input()








             





                   
