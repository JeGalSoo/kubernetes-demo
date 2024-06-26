'use client'

import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";
import dynamic from "next/dynamic";
import Header from "./component/common/module/header";
import { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import { getAuth } from "./component/users/service/user.slice";
import { parseCookie } from "next/dist/compiled/@edge-runtime/cookies";
import DashHeader from "./component/common/module/dash-header";
import { parseCookies } from "nookies";

const ReduxProvider = dynamic(() => import("@/redux/redux-provider"), {
  ssr: false
});

const inter = Inter({ subsets: ["latin"] });

// export const metadata: Metadata = {
//   title: "Create Next App",
//   description: "Generated by create next app",
// };
// const[showHeader,setShowHeader] = useState<boolean>(false);
// const auth= useSelector(getAuth)
// useEffect(()=>{
//   if(auth.token !==''){
//     setShowHeader(true)
//   }else{
//     console.log("토큰에 값이 없는 상태")
//   }
// },[auth])

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className={inter.className}>
        {parseCookies().message === 'SUCCESS' && <Header/>}
        {parseCookies().message === 'ADMIN' && <DashHeader/>}
        <div className="mt-100">
        <ReduxProvider > {children}</ReduxProvider>
        </div>
      </body>
    </html>
  );
}