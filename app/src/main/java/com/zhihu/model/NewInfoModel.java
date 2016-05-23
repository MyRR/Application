package com.zhihu.model;

import java.util.List;

/**
 * http://blog.csdn.net/liangyuancsdn/article/details/50224869
 * 最新消息
 * Created by Think on 2016/5/19.
 */
public class NewInfoModel {


    /**
     * date : 20160519
     * stories : [{"images":["http://pic4.zhimg.com/31028c64c15051e3649266725366bf3b.jpg"],"type":0,"id":8325625,"ga_prefix":"051921","title":"这是一个天才的导演，但他的故事还可以更棒"},{"images":["http://pic4.zhimg.com/91aabf1c9b5fe2df7b195881eea04057.jpg"],"type":0,"id":8325329,"ga_prefix":"051920","title":"「认真细致，死磕到底」，这样的性格反而不适合做审计"},{"images":["http://pic3.zhimg.com/09118fb9ead331bbe5f62e91688a573a.jpg"],"type":0,"id":8324292,"ga_prefix":"051919","title":"「复仇者联盟」砸坏了那么多东西，这些经济损失有多大？由谁承担？"},{"images":["http://pic4.zhimg.com/dce7f71a6549123313290507f048ea43.jpg"],"type":0,"id":8323778,"ga_prefix":"051918","title":"记账很重要，但不要只想着记录每一笔开销"},{"title":"一则好品（zhòng kǒu）味研究：为什么日本人不吃虫子","ga_prefix":"051917","images":["http://pic1.zhimg.com/201691c9a286e08195a5ac551b78f2d0.jpg"],"multipic":true,"type":0,"id":8324428},{"images":["http://pic1.zhimg.com/3f36e18d7f5a5cae9b9658e3ee6d3ab8.jpg"],"type":0,"id":8323434,"ga_prefix":"051916","title":"泡沫经济到底是什么，连牛顿也吃过它的亏"},{"images":["http://pic4.zhimg.com/771873cd45f0f0392bb3db3a9355be03.jpg"],"type":0,"id":8314625,"ga_prefix":"051915","title":"为了更快确诊、治好病，你需要掌握描述病情的艺术"},{"images":["http://pic1.zhimg.com/e95db3a2142fd5137e38a717e40f6398.jpg"],"type":0,"id":8320165,"ga_prefix":"051914","title":"我为什么会觉得她（他）这么美？"},{"images":["http://pic4.zhimg.com/133385fb5bb72905c7178e68dc3568b7.jpg"],"type":0,"id":8323718,"ga_prefix":"051913","title":"婚姻中，怎样和对方去「讨价还价」？"},{"images":["http://pic4.zhimg.com/e2d9176beb5ab380babee2293ba46563.jpg"],"type":0,"id":8313029,"ga_prefix":"051912","title":"大误 · 拥有丰富的表情包是怎样一种体验？"},{"images":["http://pic1.zhimg.com/279cc04dd8ca36f45bddbc8e0583b2fc.jpg"],"type":0,"id":8321096,"ga_prefix":"051911","title":"保鲜工序被谣传为「蘸甲醛」，甲醛说这个锅我可背不了"},{"images":["http://pic4.zhimg.com/23f7477b87dd8e93b0b7a353065def8b.jpg"],"type":0,"id":8259659,"ga_prefix":"051910","title":"到底是「滨崎步」还是「浜崎步」？中日两国可能不太一样"},{"images":["http://pic1.zhimg.com/e37b34d9c3aebff65a7666b667741c84.jpg"],"type":0,"id":8318464,"ga_prefix":"051909","title":"我首先是一个人，而不是男人或女人"},{"images":["http://pic3.zhimg.com/2cc160217c2229b37192c2a61e87bdae.jpg"],"type":0,"id":8314086,"ga_prefix":"051908","title":"如何在美国成为一名中产阶级并正确地理财"},{"images":["http://pic2.zhimg.com/f04ddb85d623b16e078547db6bfae8f9.jpg"],"type":0,"id":8321742,"ga_prefix":"051907","title":"案子来了，律师一般是怎么判断接还是不接的？"},{"images":["http://pic2.zhimg.com/4725765c73775053f1539ba54b48cb65.jpg"],"type":0,"id":8319883,"ga_prefix":"051907","title":"算了算，部分非洲兄弟比较穷可能得怪一夫多妻制"},{"images":["http://pic3.zhimg.com/0f11c6e047aa9d60b901e83ff862a856.jpg"],"type":0,"id":8319035,"ga_prefix":"051907","title":"特朗普风头正盛，希拉里却缺钱又缺人"},{"images":["http://pic3.zhimg.com/c3e908f55215c1500b9860f050325722.jpg"],"type":0,"id":8321532,"ga_prefix":"051907","title":"读读日报 24 小时热门 TOP 5 · 从驯大象到「驯」岳云鹏"},{"images":["http://pic4.zhimg.com/ffe828eb237edd8e0c1f06c4e9bc8c1b.jpg"],"type":0,"id":8320608,"ga_prefix":"051906","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic1.zhimg.com/be6767dc826f966174344303cdf68c7c.jpg","type":0,"id":8324428,"ga_prefix":"051917","title":"一则好品（zhòng kǒu）味研究：为什么日本人不吃虫子"},{"image":"http://pic1.zhimg.com/86b32c8756fc621d9b9150d0958becb8.jpg","type":0,"id":8313029,"ga_prefix":"051912","title":"大误 · 拥有丰富的表情包是怎样一种体验？"},{"image":"http://pic4.zhimg.com/4b3769a5f5bb03e8c83211d646c26d33.jpg","type":0,"id":8318464,"ga_prefix":"051909","title":"我首先是一个人，而不是男人或女人"},{"image":"http://pic1.zhimg.com/eeb70d344ac5d9fe6d405b5ddd1c8a60.jpg","type":0,"id":8321532,"ga_prefix":"051907","title":"读读日报 24 小时热门 TOP 5 · 从驯大象到「驯」岳云鹏"},{"image":"http://pic1.zhimg.com/49678fe93c78a13aa3b2c5bdd264dee0.jpg","type":0,"id":8319883,"ga_prefix":"051907","title":"算了算，部分非洲兄弟比较穷可能得怪一夫多妻制"}]
     */

    private String date;
    /**
     * images : ["http://pic4.zhimg.com/31028c64c15051e3649266725366bf3b.jpg"]
     * type : 0
     * id : 8325625
     * ga_prefix : 051921
     * title : 这是一个天才的导演，但他的故事还可以更棒
     */

    private List<StoriesBean> stories;
    /**
     * image : http://pic1.zhimg.com/be6767dc826f966174344303cdf68c7c.jpg
     * type : 0
     * id : 8324428
     * ga_prefix : 051917
     * title : 一则好品（zhòng kǒu）味研究：为什么日本人不吃虫子
     */

    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
