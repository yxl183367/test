
import requests


def test():
    try:
        url = 'http://localhost:8080/test'
        params = {
            "name":"小明"
        }

        rep = requests.post(url=url,data=params)
        # 返回字符串数据
        print(rep.text)
        return rep.text

    except:
        print("失败")



if __name__ == "__main__":
    test()






