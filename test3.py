
import pprint
def compute_percentage(wins, losses=1):
    return wins/losses


teams = {
    "astros"  : ["first", 106, 56],
     "ranges"  : ["fourth", 68, 94],
     "dodgers" : ["last", 60, 101]
    }

stats = []

for team, list in teams.items():
    a = compute_percentage(list[1], list[2])
    stats.append(a)


def compute_greatest(value):
    largest = 0

    for number in value:
        if number > largest:
            largest = number
    return largest

pprint.pprint(stats, width=1)


print(compute_greatest(stats))

