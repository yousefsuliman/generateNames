import sys
from faker import Faker


def generateName(country, gender):
    name = ""
    fake = Faker(country)
    if gender == "male":
        name = fake.first_name_male() + " " + fake.last_name()
    if gender == "female":
        name = fake.first_name_female() + " " + fake.last_name()
    return name


if __name__ == '__main__':
    country=sys.argv[1]
    gender=sys.argv[2]
    fullName = generateName(country,gender)
    print fullName
