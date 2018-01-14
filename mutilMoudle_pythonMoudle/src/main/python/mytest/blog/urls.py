from django.conf.urls import url,include
from blog.views import *

urlpatterns = [
    url(r'^sayhello/',sayHello),
    url(r'^interface/',interface),
]