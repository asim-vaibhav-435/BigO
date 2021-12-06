# BigO
Data Structure
<!DOCTYPE html>
<html>
  <head>
    <title>Big-O Algorithm Complexity Cheat Sheet (Know Thy Complexities!) @ericdrowell</title>
    
    <link href="https://cdnjs.cloudflare.com/ajax/libs/normalize/4.2.0/normalize.min.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
  </head>
  <body>
    <div id="header"> 
      <a id="logo" href="https://www.bigocheatsheet.com">Big-O Cheat Sheet</a>
      <a id="download" href="pdf/big-o-cheatsheet.pdf" download="big-o-cheatsheet.pdf">Download PDF</a>
    </div>

    <div id="page">
      <div class="google-ad">
        <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
        <!-- BigO Header -->
        <ins class="adsbygoogle"
             style="display:inline-block;width:728px;height:90px"
             data-ad-client="ca-pub-8154832549041429"
             data-ad-slot="1064631020"></ins>
        <script>
        (adsbygoogle = window.adsbygoogle || []).push({});
        </script>
      </div>


      <div class="sharethis-inline-share-buttons"></div>

      <h1>Know Thy Complexities!</h1>
      <p>
        Hi there!&nbsp; This webpage covers the space and time Big-O complexities of common algorithms used in Computer Science.&nbsp; When preparing for technical interviews in the past, I found myself spending hours crawling the internet putting together the best, average, and worst case complexities for search and sorting algorithms so that I wouldn't be stumped when asked about them.&nbsp; Over the last few years, I've interviewed at several Silicon Valley startups, and also some bigger companies, like Google, Facebook, Yahoo, LinkedIn, and Uber, and each time that I prepared for an interview, I thought to myself "Why hasn't someone created a nice Big-O cheat sheet?".&nbsp; So, to save all of you fine folks a ton of time, I went ahead and created one.&nbsp; Enjoy! - <a href="https://twitter.com/ericdrowell">Eric</a>
      </p>
      <p class="promo">

        <a href="https://www.elgrapho.com" target="_blank">Check out El Grapho, a graph data visualization library that supports millions of nodes and edges</a>


      </p>

      
        <h2 id="chartTitle">Big-O Complexity Chart</h2>  
        <!-- for webpage scrapers
        <img id="chart" src="img/big-o-complexity-chart.png" />
        -->

        <div>
          <table id="legend" class="table">
            <tbody>
              <tr>
                <td><code class="red">Horrible</code></td>
                <td><code class="orange">Bad</code></td>
                <td><code class="yellow">Fair</code></td>
                <td><code class="yellow-green">Good</code></td>
                <td><code class="green">Excellent</code></td>
              </tr>
            </tbody>
          </table> 
        </div>

        <div>
          <svg id="chart" width="800" height="500" xmlns="http://www.w3.org/2000/svg">
            <!-- horrible region -->
            <path d="M50 450 L 50 0 L 800 0 L 800 450 Z" fill="#ff8989"/>
            <!-- bad region -->
            <path d="M50 450 L 800 0 L 800 450 Z" fill="#FFC543"/>
            <!-- fair region -->
            <path d="M50 450 L 800 450 L 800 330 Z" fill="yellow"/>
            <!-- good region -->
            <path d="M50 450 L 800 450 L 800 410 Z" fill="#C8EA00"/>
            <!-- excellent region -->
            <path d="M50 450 L 800 450 L 800 440 Z" fill="#53d000"/>

            <!-- axes -->
            <path d="M50 0 L 50 450 L 800 450" fill="transparent" stroke="black" stroke-width="2"/>

            <path d="M50 448 L 800 448" fill="transparent" stroke="black" stroke-width="2"/>
            <text x="700" y="438" fill="black">O(log n), O(1)</text>

            <path d="M50 450 L 800 400" fill="transparent" stroke="black" stroke-width="2"/>
            <text x="760" y="390" fill="black">O(n)</text>

            <path d="M50 450 Q 400 350, 800 150" fill="transparent" stroke="black" stroke-width="2"/>
            <text x="630" y="190" fill="black">O(n log n)</text>

            <path d="M50 450 Q 180 380, 250 0" fill="transparent" stroke="black" stroke-width="2"/>
            <text x="260" y="30" fill="black">O(n^2)</text>

            <path d="M50 450 C 100 430, 120 350, 120 0" fill="transparent" stroke="black" stroke-width="2"/>
            <text x="125" y="20" fill="black">O(2^n)</text>

            <path d="M50 450 C 80 450, 80 350, 80 0" fill="transparent" stroke="black" stroke-width="2"/>
            <text x="80" y="20" fill="black">O(n!)</text>

            <text x="0" y="0" transform="translate(30 230) rotate(-90)" style="dominant-baseline: middle; text-anchor: middle; font-size:20px; color: #555; font-size:20px; color: #555; font-style: italic;" fill="black">Operations</text>
            <text x="0" y="0" transform="translate(420 470)" style="dominant-baseline: middle; text-anchor: middle; font-size:20px; color: #555; font-style: italic;" fill="black">Elements</text>
          </svg>
        </div>
