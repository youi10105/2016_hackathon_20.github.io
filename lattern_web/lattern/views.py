from django.shortcuts import render
from django.http import HttpResponse
from datetime import datetime
from .models import Post
# Create your views here.
def index(request):
    return render(request, 'index.html',{
        'current_time':datetime.now(),
    })

def home(request):
    post_list = Post.objects.all()
    return render(request,'home.html',{
        'post_list':post_list,
        'current_time':datetime.now(),
    })

def billboard(request):
    post_list = Post.objects.order_by('-created_at')
    return render(request,'billboard.html',{
        'post_list':post_list,
        'current_time':datetime.now(),
    })

def post_detail(request, pk):
    post = Post.objects.get(pk=pk)
    return render(request,'post.html',{'post':post})

def about(request):
    return render(request,'about.html')
