def parse(game):
    game_t = game.split()
    return int(game_t[0]), int(game_t[1])


n = int(input())
games = [parse(input()) for i in range(2*n)]

white1 = set()
white2 = set()
red1 = set()
red2 = set()
good = True
games1 = []
for i in range(len(games)):
    wt, rt = games[i]
    if not(wt in white1 or wt in white2):
        if rt not in red1:
            white1.add(wt)
            red1.add(rt)
            games1.append(i + 1)
        else:
            white2.add(wt)
            red2.add(rt)
    elif wt not in white1:
        if rt not in red1:
            white1.add(wt)
            red1.add(rt)
            games1.append(i + 1)
        else:
            good = False
            break
    else:
        if rt not in red2:
            white2.add(wt)
            red2.add(rt)
        else:
            good = False
            break

if good:
    print("YES")
    print(*games1, sep='\n')
else:
    print("NO")
