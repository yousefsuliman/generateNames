import sys
from faker import Faker


def generateName(country, gender):
    firstName = ""
    lastName = ""
    fake = Faker(country)
    if gender == "male":
        firstName = fake.first_name_male()
        lastName = fake.last_name()
    if gender == "female":
        firstName = fake.first_name_female()
        lastName = fake.last_name()
    return firstName, lastName


if __name__ == '__main__':
    country = sys.argv[1]
    gender = sys.argv[2]
    fullName = generateName(country, gender)
    name = fullName[0] + " " + fullName[1]
    print(name)
    print(fullName[0])
    print(fullName[1])
