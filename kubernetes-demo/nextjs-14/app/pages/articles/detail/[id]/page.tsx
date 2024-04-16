'use client'

import { findArticleById } from "@/app/component/articles/service/article-service"
import { getArticleById } from "@/app/component/articles/service/article-slice"
import { useEffect } from "react"
import { useDispatch, useSelector } from "react-redux"

export default function ArticleDetailPage(props:any){
    const dispatch = useDispatch()
    const article = useSelector(getArticleById)

    if(article !== undefined){
        console.log('allUser is not undefined')
        console.log(article)
    }else{
        console.log('allUser is undefined')
    }

    useEffect(()=>{
        dispatch(findArticleById(props.params.id))
    },[])


    return(<>
        <h2>게시판 상세</h2>
        {props.params.id}번 게시판 상세<br/>
        <span>id</span> {}<br/>
        <span>title : {}</span><br/>
        <span>content : {}</span> <br/>
        <span>writer : {}</span> <br/>
        <span>number : {}</span>
        </>)
}