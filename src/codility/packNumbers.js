function packNumbers(arr) {

  if (arr) {
        var arrCounted = countNumbers(arr);

        return formatList(arrCounted);
    }

    return [];
}

function countNumbers(nums) {
    var arrCounted = [];
    var prev;

    nums.forEach(function (elem) {
        if (elem !== prev) {
            arrCounted.push(elem + ":" + 1);
            prev = elem;
        } else {
            var prevSplited = arrCounted[arrCounted.length - 1].split(":");

            arrCounted[arrCounted.length - 1] = prevSplited[0] + ":" + (parseInt(prevSplited[1], 10) + 1);
        }
    });

    return arrCounted;
}

function formatList(countList) {

    return countList.map(function (elem) {
        var elemSplited = elem.split(":");

        if (elemSplited[1] === '1') {
            return parseInt(elemSplited[0], 10);
        }

        return elem;
    });
}