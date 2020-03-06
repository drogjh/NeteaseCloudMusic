package com.imooc.imooc_voice.model.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GedanDetailJson {

    private int error_code;
    private String listid;
    private String title;
    private String pic_300;
    private String pic_500;
    private String pic_w700;
    private String width;
    private String height;
    private String listenum;
    private String collectnum;
    private String tag;
    private String desc;
    private String url;

    private ArrayList<GedanDetailJson.GeDanDetail> content = new ArrayList<>();

    public void setContent(ArrayList<GeDanDetail> content) {
        this.content = content;
    }

    public ArrayList<GeDanDetail> getContent() {
        return content;
    }

    public void setErrorCode(int errorCode) {
        this.error_code = errorCode;
    }
    public int getErrorCode() {
        return error_code;
    }

    public void setListid(String listid) {
        this.listid = listid;
    }
    public String getListid() {
        return listid;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setPic300(String pic300) {
        this.pic_300 = pic300;
    }
    public String getPic300() {
        return pic_300;
    }

    public void setPic500(String pic500) {
        this.pic_500 = pic500;
    }
    public String getPic500() {
        return pic_500;
    }

    public void setPicW700(String picW700) {
        this.pic_w700 = picW700;
    }
    public String getPicW700() {
        return pic_w700;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    public String getWidth() {
        return width;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeight() {
        return height;
    }

    public void setListenum(String listenum) {
        this.listenum = listenum;
    }
    public String getListenum() {
        return listenum;
    }

    public void setCollectnum(String collectnum) {
        this.collectnum = collectnum;
    }
    public String getCollectnum() {
        return collectnum;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getTag() {
        return tag;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public static class GeDanDetail{

        /**
         * title : 其实你不懂我的心
         * del_status : 0
         * distribution : 0000000000,0000000000,0000000000,0000000000,0000000000,0000000000,0000000000,1111111111,1111111111,0000000000
         * song_id : 233769
         * author : 赵咏华
         * album_id : 67107
         * album_title : 求婚
         * relate_status : 0
         * all_rate : 96,128,224,320,flac
         * high_rate : 320
         * all_artist_id : 5438
         * copy_type : 1
         * has_mv : 0
         * toneid : 600902000004207107
         * resource_type : 0
         * is_ksong : 0
         * resource_type_ext : 0
         * versions :
         * bitrate_fee : {"0":"0|0","1":"0|0"}
         * biaoshi : lossless,perm-1
         * file_duration : 218
         * pic_radio : http://qukufile2.qianqian.com/data2/pic/6c20a7e12c3639a8618457532107961a/67107/67107.jpg@s_2,w_300,h_300
         * pic_s130 : http://qukufile2.qianqian.com/data2/pic/6c20a7e12c3639a8618457532107961a/67107/67107.jpg@s_2,w_130,h_130
         * pic_big : http://qukufile2.qianqian.com/data2/pic/6c20a7e12c3639a8618457532107961a/67107/67107.jpg@s_2,w_150,h_150
         * has_mv_mobile : 0
         * ting_uid : 1998
         * is_first_publish : 0
         * havehigh : 2
         * charge : 0
         * learn : 0
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * mv_provider : 0000000000
         * share : http://music.baidu.com/song/233769
         */

        private String title;
        private String del_status;
        private String distribution;
        private String song_id;
        private String author;
        private String album_id;
        private String album_title;
        private String relate_status;
        private String all_rate;
        private String high_rate;
        private String all_artist_id;
        private String copy_type;
        private int has_mv;
        private String toneid;
        private String resource_type;
        private String is_ksong;
        private String resource_type_ext;
        private String versions;
        private String bitrate_fee;
        private String biaoshi;
        private String file_duration;
        private String pic_radio;
        private String pic_s130;
        private String pic_big;
        private int has_mv_mobile;
        private String ting_uid;
        private int is_first_publish;
        private int havehigh;
        private int charge;
        private int learn;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String mv_provider;
        private String share;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDel_status() {
            return del_status;
        }

        public void setDel_status(String del_status) {
            this.del_status = del_status;
        }

        public String getDistribution() {
            return distribution;
        }

        public void setDistribution(String distribution) {
            this.distribution = distribution;
        }

        public String getSongid() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public String getRelate_status() {
            return relate_status;
        }

        public void setRelate_status(String relate_status) {
            this.relate_status = relate_status;
        }

        public String getAll_rate() {
            return all_rate;
        }

        public void setAll_rate(String all_rate) {
            this.all_rate = all_rate;
        }

        public String getHigh_rate() {
            return high_rate;
        }

        public void setHigh_rate(String high_rate) {
            this.high_rate = high_rate;
        }

        public String getAll_artist_id() {
            return all_artist_id;
        }

        public void setAll_artist_id(String all_artist_id) {
            this.all_artist_id = all_artist_id;
        }

        public String getCopy_type() {
            return copy_type;
        }

        public void setCopy_type(String copy_type) {
            this.copy_type = copy_type;
        }

        public int getHas_mv() {
            return has_mv;
        }

        public void setHas_mv(int has_mv) {
            this.has_mv = has_mv;
        }

        public String getToneid() {
            return toneid;
        }

        public void setToneid(String toneid) {
            this.toneid = toneid;
        }

        public String getResource_type() {
            return resource_type;
        }

        public void setResource_type(String resource_type) {
            this.resource_type = resource_type;
        }

        public String getIs_ksong() {
            return is_ksong;
        }

        public void setIs_ksong(String is_ksong) {
            this.is_ksong = is_ksong;
        }

        public String getResource_type_ext() {
            return resource_type_ext;
        }

        public void setResource_type_ext(String resource_type_ext) {
            this.resource_type_ext = resource_type_ext;
        }

        public String getVersions() {
            return versions;
        }

        public void setVersions(String versions) {
            this.versions = versions;
        }

        public String getBitrate_fee() {
            return bitrate_fee;
        }

        public void setBitrate_fee(String bitrate_fee) {
            this.bitrate_fee = bitrate_fee;
        }

        public String getBiaoshi() {
            return biaoshi;
        }

        public void setBiaoshi(String biaoshi) {
            this.biaoshi = biaoshi;
        }

        public String getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(String file_duration) {
            this.file_duration = file_duration;
        }

        public String getPic_radio() {
            return pic_radio;
        }

        public void setPic_radio(String pic_radio) {
            this.pic_radio = pic_radio;
        }

        public String getPic_s130() {
            return pic_s130;
        }

        public void setPic_s130(String pic_s130) {
            this.pic_s130 = pic_s130;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }

        public void setHas_mv_mobile(int has_mv_mobile) {
            this.has_mv_mobile = has_mv_mobile;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public int getIs_first_publish() {
            return is_first_publish;
        }

        public void setIs_first_publish(int is_first_publish) {
            this.is_first_publish = is_first_publish;
        }

        public int getHavehigh() {
            return havehigh;
        }

        public void setHavehigh(int havehigh) {
            this.havehigh = havehigh;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getLearn() {
            return learn;
        }

        public void setLearn(int learn) {
            this.learn = learn;
        }

        public String getSong_source() {
            return song_source;
        }

        public void setSong_source(String song_source) {
            this.song_source = song_source;
        }

        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }

        public void setKorean_bb_song(String korean_bb_song) {
            this.korean_bb_song = korean_bb_song;
        }

        public String getMv_provider() {
            return mv_provider;
        }

        public void setMv_provider(String mv_provider) {
            this.mv_provider = mv_provider;
        }

        public String getShare() {
            return share;
        }

        public void setShare(String share) {
            this.share = share;
        }
    }
}
