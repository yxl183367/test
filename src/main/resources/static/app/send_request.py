
import requests
import json

def test():
    try:
        url = 'http://localhost:8080/test'
        params = {
            "name":"小明"
        }

        rep = requests.post(url=url,data=params)
        # 返回字符串数据
        sul = rep.json()

        print(sul["code"])

        if sul["code"] == "200":
            print("返回状态码异常")
            return sul["msg"]

        return "执行成功"
    except:
        print("失败")



if __name__ == "__main__":
    test()






