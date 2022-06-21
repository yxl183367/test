
import requests
import json

def test():
    url = 'http://localhost:8080/test'
    params = {
        "name": "小明"
    }

    rep = requests.post(url=url, data=params)
    # 返回字符串数据
    sul = rep.json()
    try:
        if sul["code"] != "200":
            print("返回状态码异常")


        return "执行成功"
    except:
        print(sul["data"])



if __name__ == "__main__":
    test()






