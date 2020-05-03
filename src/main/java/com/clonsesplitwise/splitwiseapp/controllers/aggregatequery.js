db.getCollection("users").aggregate([
  {
    $match: { _id: ObjectId("5ead8b90c3bdd6466504b07e") },
  },
  {
    $project: {
      _id: {
        $toString: "$_id",
      },
      email: {
          $toString: '$email'
      }
    },
  },
  {
    $lookup: {
      from: "groups",
      localField: "_id",
      foreignField: "users",
      as: "groups",
    },
  },
  {
    $project: { email: 0 },
  },
]);
